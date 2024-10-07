package lesson_11.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        ArrayList<Integer> headArrayList = new ArrayList<>();
        LinkedList<Integer> headLinkedList = new LinkedList<>();

        ArrayList<Integer> divisibleBy3Array = new ArrayList<>();
        ArrayList<Integer> divisibleBy2Array = new ArrayList<>();
        ArrayList<Integer> otherNumbersArray = new ArrayList<>();

        LinkedList<Integer> divisibleBy3Linked = new LinkedList<>();
        LinkedList<Integer> divisibleBy2Linked = new LinkedList<>();
        LinkedList<Integer> otherNumbersLinked = new LinkedList<>();


        System.out.println("Array List");
        fillLines(headArrayList, divisibleBy3Array, divisibleBy2Array, otherNumbersArray, console);

        System.out.println("Linked List");
        fillLines(headLinkedList, divisibleBy3Linked, divisibleBy2Linked, otherNumbersLinked, console);

        printList(divisibleBy3Array, divisibleBy2Array, otherNumbersArray);
        printList(divisibleBy3Linked, divisibleBy2Linked, otherNumbersLinked);

        console.close();
    }

    private static void fillLines(List<Integer> headNumbers, List<Integer> divisibleBy3, List<Integer> divisibleBy2,
                                  List<Integer> otherNumbers, Scanner console) {

        while (headNumbers.size() < 20) {
            headNumbers.add(console.nextInt());
        }
        for (int number : headNumbers) {
            if (number % 3 == 0) {
                divisibleBy3.add(number);
            }
            if (number % 2 == 0) {
                divisibleBy2.add(number);
            }
            if (number % 3 != 0 && number % 2 != 0) {
                otherNumbers.add(number);
            }
        }

    }

    private static void printList(List<Integer> list3, List<Integer> list2, List<Integer> other) {
        System.out.println("divisible By 3:");
        for (Integer number : list3) {
            System.out.println(number);
        }
        System.out.println("divisible By 2:");
        for (Integer number : list2) {
            System.out.println(number);
        }
        System.out.println("other numbers:");
        for (Integer number : other) {
            System.out.println(number);
        }
        System.out.println();
    }
}
