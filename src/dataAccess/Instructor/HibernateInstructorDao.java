package dataAccess.Instructor;
import entities.Instructor;

public class HibernateInstructorDao implements IInstructorAccess {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+"added to Instructors with HiberNate");
    }
}
