package dataAccess.category;
import entities.Category;

public class HibernateCategoryDao implements ICategoryAccess {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName()+"added to Categories with HiberNate");
    }
}
