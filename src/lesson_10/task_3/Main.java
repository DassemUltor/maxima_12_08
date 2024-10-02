package lesson_10.task_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var list = new ArrayList<String>();


        System.out.println("Enter 5 lines");
        while (list.size() < 5) {
            list.add(console.nextLine());
        }
        String minLength = list.getFirst();

        for (String s : list) {
            if (s.length() < minLength.length()) {
                minLength = s;
            }
        }

        for (String s : list) {
            if (s.length() == minLength.length()) {
                System.out.println("Shortest string - " + s);
            }
        }
        console.close();

    }
}
