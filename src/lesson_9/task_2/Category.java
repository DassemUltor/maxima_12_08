package lesson_9.task_2;

import java.util.List;

public class Category {
    protected String categoryName;
    protected List<Product> products;

    public Category(String name, List<Product> products) {
        this.categoryName = name;
        this.products = products;
    }

}
