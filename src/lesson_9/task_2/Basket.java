package lesson_9.task_2;

import java.util.List;

public class Basket {
    private List<Product> purchasedProducts;

    public Basket(List<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    @Override
    public String toString() {
        return "Basket:\n " + purchasedProducts;
    }
}
