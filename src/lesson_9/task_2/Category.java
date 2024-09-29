package lesson_9.task_2;

import java.util.ArrayList;
import java.util.List;

public class Category {
    protected String categoryName;
    protected List<Product> productList;

    public Category(String name) {
        this.categoryName = name;
        this.productList = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }
}
