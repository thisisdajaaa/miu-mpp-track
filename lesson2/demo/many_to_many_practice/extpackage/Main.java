package lesson2.demo.many_to_many_practice.extpackage;

import lesson2.demo.many_to_many_practice.Course;
import lesson2.demo.many_to_many_practice.CourseGrade;
import lesson2.demo.many_to_many_practice.Student;
import lesson2.demo.many_to_many_practice.StudentCourseFactory;

public class Main {
    public static void main(String[] args) {
        Student student1 = StudentCourseFactory.createStudent("Das1");
        Student student2 = StudentCourseFactory.createStudent("Das2");
        Course course1 = StudentCourseFactory.createCourse("Course1");
        Course course2 = StudentCourseFactory.createCourse("Course2");

        StudentCourseFactory.bindStudentToCourse(student1, course1);
        StudentCourseFactory.bindStudentToCourse(student1, course2);
        StudentCourseFactory.bindStudentToCourse(student2, course1);

        StudentCourseFactory.addCourseGrade(student1, course1, 1);
        StudentCourseFactory.addCourseGrade(student1, course2, 2);
        StudentCourseFactory.addCourseGrade(student2, course1, 1);
        StudentCourseFactory.addCourseGrade(student2, course2, 2);

        System.out.println(student2.getCourseGrades());

        for (CourseGrade courseGrade: student2.getCourseGrades()) {
            System.out.println(courseGrade.getGrade());
        }
    }
}
