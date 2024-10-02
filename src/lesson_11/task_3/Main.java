package lesson_11.task_3;

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

        while (strings.size() < 10) {
            strings.add(console.nextLine());
        }
        long startTime = System.nanoTime();
        String shortest = strings.getFirst();
        String longest = strings.getFirst();

        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        int indexShortest = strings.indexOf(shortest);
        int indexLongest = strings.indexOf(longest);

        if (indexShortest < indexLongest) {
            System.out.println("First shortest line: " + shortest);
        } else {
            System.out.println("First longest line: " + longest);
        }
        long finishTime = System.nanoTime();
        long elapsed = (finishTime - startTime) / 1000;
        System.out.println("operating time: " + elapsed + " milliseconds");

    }
}
