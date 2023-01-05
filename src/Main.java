import business.CategoryManager;
import business.CourseManager;
import business.IManager;
import business.InstructorManager;
import dataAccess.Instructor.HibernateInstructorDao;
import dataAccess.category.HibernateCategoryDao;
import dataAccess.course.HibernateCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import core.logging.EmailLogger;

public class Main {
    public static void main(String[] args) {
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),new EmailLogger());
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),new EmailLogger());
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),new EmailLogger());
        Instructor instructor =new Instructor("Emin","Sahin");
        instructorManager.add(instructor);
        Category category = new Category("Programming");
        categoryManager.add(category);
        Course course = new Course("Java Programming",category,50,instructor);
        courseManager.add(course);
    }
}