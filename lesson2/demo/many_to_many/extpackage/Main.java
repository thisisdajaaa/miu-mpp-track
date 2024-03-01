package lesson2.demo.many_to_many.extpackage;

import lesson2.demo.many_to_many.Course;
import lesson2.demo.many_to_many.Student;
import lesson2.demo.many_to_many.StudentCourseFactory;

public class Main {
    public static void main(String[] args) {
        Student student1 = StudentCourseFactory.createStudent("Das");
        Student student2 = StudentCourseFactory.createStudent("XC");

        Course course1 = StudentCourseFactory.createCourse("Cours1");
        Course course2 = StudentCourseFactory.createCourse("aCours2");

        StudentCourseFactory.addStudentToCourse(student1, course1);
        StudentCourseFactory.addStudentToCourse(student1, course2);
        StudentCourseFactory.addStudentToCourse(student2, course1);

        StudentCourseFactory.addCourseLike(student1, course1, 5);
        StudentCourseFactory.addCourseLike(student1, course2, 4);
        StudentCourseFactory.addCourseLike(student2, course1, 3);

        System.out.println(StudentCourseFactory.getStudents());

        System.out.println(student2.getCourseLikes());
    }
}
