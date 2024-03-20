package final_practice.prog11.prob1.bugreporter;


import final_practice.prog11.prob1.classfinder.ClassFinder;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

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
    public final static String FILE_LOCATION = "/Users/daja/dev/backend/java/miu-mpp-track/final_practice/prog11/prob1/bugreporter";
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
        List<String> names = new ArrayList<String>();
        for (Class<?> cl : classes) {
            if (cl.isAnnotationPresent(BugReport.class)) {
                BugReport annotation = (BugReport) cl.getAnnotation(BugReport.class);
                String name = annotation.assignedTo();
                names.add(name);
            }
        }
        System.out.println(names);

    }


}
