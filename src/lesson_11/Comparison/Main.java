package lesson_11.Comparison;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("ArrayList:");
        fillList(arrayList);
        System.out.println("LinkedList:");
        fillList(linkedList);
    }

    private static void fillList(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            list.addFirst(i);
        }
        long finishTime = System.nanoTime();
        long elapsedTime = (finishTime - startTime) / 1_000;
        System.out.println("time to insert items to the top of the list: " + elapsedTime + " milliseconds");

        long startTime2 = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            list.addLast(i);
        }
        long finishTime2 = System.nanoTime();
        long elapsedTime2 = (finishTime2 - startTime2) / 1_000_000;
        System.out.println("time to insert items to the end of the list: " + elapsedTime2 + " milliseconds");
    }


}
