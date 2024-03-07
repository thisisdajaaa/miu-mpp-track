package midterm_practice.mideterm_practice_5;

import midterm_practice.mideterm_practice_5.models.Course;
import midterm_practice.mideterm_practice_5.models.ModelFactory;
import midterm_practice.mideterm_practice_5.models.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = ModelFactory.createStudent("Das1");
        Student student2 = ModelFactory.createStudent("Das2");

        Course course1 = ModelFactory.createCourse("Course1");
        Course course2 = ModelFactory.createCourse("Course2");

        ModelFactory.addCourseGrade(student1, course1, 4);
        ModelFactory.addCourseGrade(student1, course2, 4);
        ModelFactory.addCourseGrade(student2, course1, 5);
        ModelFactory.addCourseGrade(student2, course2, 5);

        System.out.println(student1.getCourseGrades().get(0).getStudent().getName());
    }
}
