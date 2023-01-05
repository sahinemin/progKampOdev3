package business;

import dataAccess.course.ICourseAccess;
import entities.Course;
import core.logging.ILogger;
import validation.Validator;
import java.util.ArrayList;

public class CourseManager extends IManager {
    private final ICourseAccess courseAccess;
    private final ArrayList<Course> courseList=new ArrayList<>();

    public CourseManager(ICourseAccess courseAccess, ILogger logger) {
        super(logger);
        this.courseAccess=courseAccess;
    }

    public void add(Course course) {
        if(courseList.contains(course) ){
            System.out.println(course.getCourseName()+"Have been already registered to database");
     }
        else if(!Validator.validatePrice(course))
            System.out.println("Course cannot have a price lower than 0");
        else {
            courseList.add(course);
            System.out.println(course.getCourseName()+" "+course.getCourseInstructor().getFirstName()+" "+course.getCourseInstructor().getLastName()+" "+course.getPrice() + " ₺");
            System.out.println("Course added to database");
        }
    }
    public ICourseAccess getCourseAccess() {
        return courseAccess;
    }
}
