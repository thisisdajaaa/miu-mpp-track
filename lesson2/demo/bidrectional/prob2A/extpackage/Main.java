package lesson2.demo.bidrectional.prob2A.extpackage;

import lesson2.demo.bidrectional.prob2A.GradeReport;
import lesson2.demo.bidrectional.prob2A.Student;
import lesson2.demo.bidrectional.prob2A.StudentFactory;

public class Main {
    public static void main(String[] args) {
        Student student = StudentFactory.createStudent("Dann", 1);

        String gg = String.format("%s's Grade: %s", student.getName(), student.getGradeReport());
        System.out.println(gg);

        GradeReport gradeReport = student.getGradeReport();
        System.out.println("Owner of grade report: " + gradeReport.getOwner());
    }
}
