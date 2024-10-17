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


        System.out.println("Enter number of house:");
        Integer keyHouse = console.nextInt();

        if (map.containsKey(keyHouse)) {
            System.out.println(map.get(keyHouse));
        } else {
            System.out.println("Invalid key");
        }

        console.close();
    }

}
