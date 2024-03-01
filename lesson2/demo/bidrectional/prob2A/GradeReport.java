package lesson2.demo.bidrectional.prob2A;

import java.util.ArrayList;
import java.util.List;

public class GradeReport {

    private Student owner;
    private Integer reportNum;

    GradeReport(Student student, Integer newReportNum) {
        owner = student;
        reportNum = newReportNum;
    }

    public Integer getReportNum() {
        return reportNum;
    }

    public void setReportNum(Integer reportNum) {
        this.reportNum = reportNum;
    }

    public Student getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "GradeReport{" +
                "reportNum=" + reportNum +
                '}';
    }
}
