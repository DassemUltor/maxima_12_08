package lesson_9.task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product veg1 = new Product("potatoes", 45.60, 4.8);
        Product veg2 = new Product("carrots", 15.90, 4.7);
        Product veg3 = new Product("onions", 35.60, 4.3);

        Product fruit1 = new Product("apple", 135.70, 4.9);
        Product fruit2 = new Product("banana", 127.60, 4.4);
        Product fruit3 = new Product("orange", 150.00, 3.9);

        List<Product> vegetableList = List.of(veg1, veg2, veg3);
        List<Product> fruitList = List.of(fruit1, fruit2, fruit3);

        Category vegetables = new Category("vegetables", vegetableList);
        Category fruits = new Category("fruits", fruitList);

        List<Product> basketUser = new ArrayList<>();
        basketUser.add(vegetables.products.get(0));
        basketUser.add(vegetables.products.get(2));
        basketUser.add(fruits.products.get(2));
        basketUser.add(fruits.products.get(1));
        Basket basket = new Basket(basketUser);

        User user = new User("user@mail.com", "qwerty", basket);

        System.out.println(user);


    }
}
