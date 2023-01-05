package business;

import dataAccess.Instructor.IInstructorAccess;
import entities.Instructor;
import core.logging.ILogger;
import java.util.ArrayList;

public class InstructorManager extends IManager{
    private final IInstructorAccess instructorAccess;
    private ArrayList<Instructor> instructorList= new ArrayList<>();
    public InstructorManager(IInstructorAccess instructorAccess, ILogger logger) {
        super(logger);
        this.instructorAccess=instructorAccess;
    }

    public void add(Instructor instructor) {
        if(!instructorList.contains(instructor)){
            instructorList.add(instructor);
            System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" Added to database");
        }
        else {
            System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+"is already registered to database");
        }
    }



}
