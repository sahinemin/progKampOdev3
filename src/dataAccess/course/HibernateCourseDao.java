package dataAccess.course;
import entities.Course;

public class HibernateCourseDao implements ICourseAccess {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName()+"added to Courses with HiberNate");
    }
}
