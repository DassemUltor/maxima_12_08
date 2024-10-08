package lesson_10.task_2;

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
        String maxLength = list.getFirst();
        for (String s : list) {
            if (s.length() > maxLength.length()) {
                maxLength = s;
            }
        }

        for (String s : list) {
            if (s.length() == maxLength.length()) {
                System.out.println("Longest string - " + s);
            }
        }
        console.close();

    }
}
