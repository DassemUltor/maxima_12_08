package lesson_11.Comparison;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList1 = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        List<Integer> linkedList1 = new LinkedList<>();
        List<Integer> linkedList2 = new LinkedList<>();


        System.out.println("ArrayList:");
        insertItemInTop(arrayList1);
        System.out.println("LinkedList:");
        insertItemInTop(linkedList1);
        System.out.println();
        System.out.println("ArrayList:");
        insertItemInEnd(arrayList2);
        System.out.println("LinkedList:");
        insertItemInEnd(linkedList2);
    }

    private static void insertItemInTop(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            list.addFirst(i);
        }
        long finishTime = System.nanoTime();
        long elapsedTime = (finishTime - startTime) / 1_000;
        System.out.println("time to insert items to the top of the list: " + elapsedTime + " milliseconds");

    }

    private static void insertItemInEnd(List<Integer> list) {
        long startTime2 = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            list.addLast(i);
        }
        long finishTime2 = System.nanoTime();
        long elapsedTime2 = (finishTime2 - startTime2) / 1_000_000;
        System.out.println("time to insert items to the end of the list: " + elapsedTime2 + " milliseconds");
    }


}
