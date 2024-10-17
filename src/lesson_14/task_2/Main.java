package lesson_14.task_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);


        System.out.println("Enter the name of month:");
        String month = console.nextLine();

        if (map.containsKey(month)) {
            System.out.printf("%s is the %d month", month, map.get(month));
        } else {
            System.out.println("Invalid month");
        }

        console.close();

    }
}
