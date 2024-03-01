package lesson2.demo.many_to_many;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCourseFactory {
    private static final List<Student> students = new ArrayList<>();
    private static final List<Course> courses = new ArrayList<>();;

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

    public static void addCourseLike(Student student, Course course, Integer rating) {
        CourseLike courseLike = findCourseLike(student, course);

        if (courseLike == null) {
            CourseLike newCourseLike = new CourseLike(rating);
            newCourseLike.setStudent(student);
            newCourseLike.setCourse(course);
            student.getCourseLikes().add(newCourseLike);
            course.getCourseLikes().add(newCourseLike);
            return;
        }

        courseLike.setRating(rating);
    }

    public static void addStudentToCourse(Student student, Course course) {
        if (findCourseLike(student, course) == null) {
            CourseLike courseLike = new CourseLike();
            courseLike.setStudent(student);
            courseLike.setCourse(course);
            student.getCourseLikes().add(courseLike);
            course.getCourseLikes().add(courseLike);
        }
    }

    public static void addCourseToStudent(Course course, Student student) {
        if (findCourseLike(student, course) == null) {
            CourseLike courseLike = new CourseLike();
            courseLike.setStudent(student);
            courseLike.setCourse(course);
            student.getCourseLikes().add(courseLike);
            course.getCourseLikes().add(courseLike);
        }
    }


    public static CourseLike findCourseLike(Student student, Course course) {
        for (CourseLike courseLike : student.getCourseLikes()) {
            if (courseLike.getCourse().equals(course)) {
                return courseLike;
            }
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
