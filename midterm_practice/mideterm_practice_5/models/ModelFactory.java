package midterm_practice.mideterm_practice_5.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModelFactory {
    private final static List<Course> courses = new ArrayList<>();
    private final static List<Student> students = new ArrayList<>();

    public static Student createStudent(String name) {
        Student student = new Student(name);
        students.add(student);
        return student;
    }

    public static Course createCourse(String name) {
        Course course = new Course(name);
        courses.add(course);
        return course;
    }

    public static void addCourseGrade(Student student, Course course, Integer grade) {
        if (findCourseGrade(student, course) == null) {
            CourseGrade courseGrade = new CourseGrade(grade, student, course);
            student.getCourseGrades().add(courseGrade);
            course.getCourseGrades().add(courseGrade);
        }
    }

    private static CourseGrade findCourseGrade(Student student, Course course) {
        for (CourseGrade courseGrade : student.getCourseGrades()) {
            if (courseGrade.getCourse().equals(course)) return courseGrade;
        }

        return null;
    }

    public static List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public static List<Course> getCourses() {
        return Collections.unmodifiableList(courses);
    }
}
