package lesson2.demo.bidrectional.prob2A;

public class Student {
    private String name;
    private GradeReport gradeReport;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeReport(GradeReport gradeReport) {
        this.gradeReport = gradeReport;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
