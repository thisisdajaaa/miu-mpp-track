package lesson2.demo.bidrectional.prob2A;

public class StudentFactory {
    public static Student createStudent(String name, Integer reportNum) {
        if (name == null) throw new IllegalArgumentException("Name is required");
        if (reportNum == null) throw new IllegalArgumentException("Report num is required");

        Student student = new Student(name);
        GradeReport gradeReport = new GradeReport(student, reportNum);

        student.setGradeReport(gradeReport);

        return student;
    }
}
