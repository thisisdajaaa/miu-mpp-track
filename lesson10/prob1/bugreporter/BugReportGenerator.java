package lesson10.prob1.bugreporter;

import lesson10.prob1.classfinder.ClassFinder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;


/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * <p>
 * Joe Smith
 * reportedBy:
 * classname:
 * description:
 * severity:
 * <p>
 * reportedBy:
 * classname:
 * description:
 * severity:
 * <p>
 * Tom Jones
 * reportedBy:
 * classname:
 * description:
 * severity:
 * <p>
 * reportedBy:
 * classname:
 * description:
 * severity:
 */
public class BugReportGenerator {
    private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
    private static final String PACKAGE_TO_SCAN = "lesson10.prob1.javapackage";
    public final static String FILE_LOCATION = "/Users/daja/dev/backend/java/miu-mpp-track/lesson10/prob1/bugreporter";
    private static final String REPORT_NAME = "bug_report.txt";
    private static final String REPORTED_BY = "reportedBy: ";
    private static final String CLASS_NAME = "classname: ";
    private static final String DESCRIPTION = "description: ";
    private static final String SEVERITY = "severity: ";

    public void reportGenerator() {
        List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);

        //sample code for reading annotations -- you will need to change
        //this quite a bit to solve the problem
        //Sample code below obtains a list of names of developers assigned to bugs
        Map<String, List<TransformedBugReport>> bugReports = classes.stream()
                .filter(cl -> cl.isAnnotationPresent(BugReport.class))
                .map(classTransformedBugReportFunction)
                .collect(Collectors.groupingBy(TransformedBugReport::getAssignedTo));

        System.out.println(bugReports);

        System.out.println(Math.round(Math.pow(7.0, 1.0 / 4.0)));

        printToFile(bugReports);
    }

    private final Function<Class<?>, TransformedBugReport> classTransformedBugReportFunction = cl -> {
        BugReport annotation = cl.getAnnotation(BugReport.class);
        return new TransformedBugReport(annotation.assignedTo(), annotation.reportedBy(), annotation.severity(), annotation.description(), cl.getName());
    };

    private void printToFile(Map<String, List<TransformedBugReport>> bugReports) {
        File file = new File(FILE_LOCATION, REPORT_NAME);

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {

            bugReports.forEach((assignedTo, reports) -> {
                writer.println(assignedTo);

                AtomicInteger reportIndex = new AtomicInteger();

                reports.forEach(report -> {
                    writer.printf("\t %s %s \n", REPORTED_BY, report.getReportedBy());
                    writer.printf("\t %s %s \n", CLASS_NAME, report.getClassName());
                    writer.printf("\t %s %s \n", DESCRIPTION, report.getDescription());
                    writer.printf("\t %s %s \n", SEVERITY, report.getSeverity());

                    if (reportIndex.getAndIncrement() < reports.size() - 1)  writer.println();
                });

                writer.println();
            });
        } catch (IOException e) {
            LOG.warning("IOException attempting to write a file: " + e.getMessage());
        }
    }
}
