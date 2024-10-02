package lesson_11.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner console = new Scanner(System.in);

        System.out.println("Array List");
        fillLines(arrayList, console);
        System.out.println("Linked List");
        fillLines(linkedList, console);

        console.close();
    }

    private static void fillLines(List<String> strings, Scanner console) {

        while (strings.size() < 5) {
            strings.addFirst(console.nextLine());
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < 13; i++) {
            String temp = strings.getLast();
            strings.removeLast();
            strings.addFirst(temp);
        }
        long finishTime = System.nanoTime();
        long elapsed = (finishTime - startTime) / 1000;
        System.out.println("operating time: " + elapsed + " milliseconds");

        for (String string : strings) {
            System.out.println(string);
        }

    }
}
