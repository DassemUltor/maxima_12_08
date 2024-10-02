package lesson_11.task_1;

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
        int count = 1;
        while (strings.size() < 10) {
            String temp = console.nextLine();
            long startTime = System.nanoTime();
            strings.addFirst(temp);
            long finishTime = System.nanoTime();
            long elapsed = (finishTime - startTime) / 1000;
            System.out.println("time of adding element # " + count + ": " + elapsed + " milliseconds");
            count++;
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
