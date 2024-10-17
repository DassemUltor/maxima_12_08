package lesson_14.task_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ivanov family");
        map.put(2, "Petrov family");
        map.put(3, "Abramovich family");
        map.put(4, "Sidorov family");
        map.put(5, "Melnikov family");

        switch (console.nextInt()) {
            case 1 -> System.out.println(map.get(1));
            case 2 -> System.out.println(map.get(2));
            case 3 -> System.out.println(map.get(3));
            case 4 -> System.out.println(map.get(4));
            case 5 -> System.out.println(map.get(5));
            default -> System.out.println("This house number does not exist");
        }

        console.close();
    }

}
