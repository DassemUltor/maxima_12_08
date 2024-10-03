package lesson_12;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Coin> coins = new ArrayList<>();

        coins.add(new Coin(1.0, "USA", 1.0, 2.5));
        coins.add(new Coin(0.5, "Canada", 0.5, 1.5));
        coins.add(new Coin(5.0, "Russia", 3.0, 2.0));
        coins.add(new Coin(0.25, "Mexico", 0.25, 1.0));
        coins.add(new Coin(10.0, "Belarus", 5.25, 1.0));
        coins.add(new Coin(0.5, "Sweden", 0.5, 1.2));

        coins.sort(new CoinsCompare());
        for (Coin coin : coins) {
            System.out.println(coin);
        }

    }
}

