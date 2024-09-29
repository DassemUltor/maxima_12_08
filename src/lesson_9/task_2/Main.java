package lesson_9.task_2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Category vegetable = new Category("vegetables");
        Category fruits = new Category("fruits");

        Product veg1 = new Product("vegetable", "potatoes", 45.60, 4.8);
        Product veg2 = new Product("vegetable", "carrots", 15.90, 4.7);
        Product veg3 = new Product("vegetable", "onions", 35.60, 4.3);

        vegetable.productList.add(veg1);
        vegetable.productList.add(veg2);
        vegetable.productList.add(veg3);

        Product fruit1 = new Product("fruit", "apple", 135.70, 4.9);
        Product fruit2 = new Product("fruit", "banana", 127.60, 4.4);
        Product fruit3 = new Product("fruit", "orange", 150.00, 3.9);

        fruits.productList.add(fruit1);
        fruits.productList.add(fruit2);
        fruits.productList.add(fruit3);


        List<Product> products = List.of(veg1, fruit2, veg3);

        Basket basket = new Basket(products);

        User user = new User("user@mail.com", "qwerty", basket);

        System.out.println(user);


    }
}
