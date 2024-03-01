package lesson2.demo.many_to_many_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCourseFactory {
    private static final List<Course> courses = new ArrayList<>();
    private static final List<Student> students = new ArrayList<>();

    public static Course createCourse(String name) {
        Course course = new Course(name);
        courses.add(course);
        return course;
    }

    public static Student createStudent(String name) {
        Student student = new Student(name);
        students.add(student);
        return student;
    }

    public static void bindStudentToCourse(Student student, Course course) {
        if (findCourseGrade(student, course) == null) {
            CourseGrade courseGrade = new CourseGrade();
            courseGrade.setCourse(course);
            courseGrade.setStudent(student);
            student.getCourseGrades().add(courseGrade);
            course.getCourseGrades().add(courseGrade);
        }
    }

    public static void addCourseGrade(Student student, Course course, Integer grade) {
        CourseGrade courseGrade = findCourseGrade(student, course);

        if (courseGrade == null) {
            CourseGrade newCourseGrade = new CourseGrade(grade);
            newCourseGrade.setCourse(course);
            newCourseGrade.setStudent(student);
            student.getCourseGrades().add(newCourseGrade);
            course.getCourseGrades().add(newCourseGrade);
            return;
        }

        courseGrade.setGrade(grade);
    }

    public static CourseGrade findCourseGrade(Student student, Course course) {
        for (CourseGrade courseGrade: student.getCourseGrades()) {
            if (courseGrade.getCourse().equals(course)) {
                return courseGrade;
            }
        }

        return null;
    }

    public static List<Course> getCourses() {
        return Collections.unmodifiableList(courses);
    }

    public static List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }
}
