package lesson_9.task_2;


import java.util.List;

public class Category {
    private String categoryName;
    private List<Product> products;

    public Category(String categoryName, List<Product> products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
