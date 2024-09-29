package lesson_9.task_2;


public class Product extends Category {

    private String nameProduct;
    private double price;
    private double raiting;

    public Product(String categoryName, String nameProduct, double price, double raiting) {
        super(categoryName);
        this.nameProduct = nameProduct;
        this.price = price;
        this.raiting = raiting;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public double getRaiting() {
        return raiting;
    }

    @Override
    public String toString() {
        return nameProduct +
                "- price=" + price +
                ", raiting=" + raiting + "\n";
    }
}



