package entities;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private Category courseCategory;
    private Instructor courseInstructor;
    private int price;


    public Course(String courseName, Category courseCategory, int price, Instructor courseInstructor) {
            this.courseName = courseName;
            this.courseCategory = courseCategory;
            this.price = price;
            this.courseInstructor = courseInstructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public Category getCourseCategory() {
        return courseCategory;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCategory(Category courseCategory) {
        this.courseCategory = courseCategory;
    }

    public Instructor getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(Instructor courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
