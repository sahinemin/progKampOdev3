package validation;

import entities.Course;

public class Validator {
    public static boolean validatePrice(Course course){
        return course.getPrice() >= 0;
    }

}
