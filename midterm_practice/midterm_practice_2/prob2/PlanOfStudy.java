package midterm_practice.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlanOfStudy {
    private List<Course> courses;

    PlanOfStudy() {}

    public List<Course> getCourseList() {
        return Collections.unmodifiableList(courses);
    }

    public void addCourse(Course course) {
        if (courses == null) courses = new ArrayList<>();

        courses.add(course);
    }
}
