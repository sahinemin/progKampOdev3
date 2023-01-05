package dataAccess.course;
import entities.Course;

public class JdbcCourseDao implements ICourseAccess {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName()+"added to Courses with JDBC");
    }
}
