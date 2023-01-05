package business;

import dataAccess.category.ICategoryAccess;
import entities.Category;
import core.logging.ILogger;
import java.util.ArrayList;

public class CategoryManager extends IManager{
    private ICategoryAccess categoryAccess;
    private final ArrayList<Category> categoryList=new ArrayList<>();
    public CategoryManager(ICategoryAccess categoryAccess, ILogger logger) {
        super(logger);
        this.categoryAccess=categoryAccess;
    }
    public void add(Category category) {
        if(!categoryList.contains(category))
        System.out.println(category.getCategoryName()+" Category added to database");
        else{
            System.out.println("Category has been already registered to database");
        }

    }


}
