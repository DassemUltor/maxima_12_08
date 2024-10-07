package lesson_11.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner console = new Scanner(System.in);

        System.out.println("Array List");
        fillLines(arrayList, console);

        console.close();
    }

    private static void fillLines(List<String> strings, Scanner console) {

        while (strings.size() < 5) {
            strings.addFirst(console.nextLine());
        }
        for (int i = 0; i < 13; i++) {
            String temp = strings.getLast();
            strings.removeLast();
            strings.addFirst(temp);
        }


        for (String string : strings) {
            System.out.println(string);
        }

    }
}
