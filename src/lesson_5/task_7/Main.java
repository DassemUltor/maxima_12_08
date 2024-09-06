package lesson_5.task_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

//    Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

    public static void main(String[] args) {

        var array = new Integer[20];
        Scanner console = new Scanner(System.in);

        System.out.println("Enter 20 numbers: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

        console.close();
    }
}
