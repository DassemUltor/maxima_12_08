package lesson_6.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_1 {

//    Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
// Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

    public static void main(String[] args) {

        var console = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.println("Enter lines. To exit, enter empty line");

        while (true) {
            String input = console.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        for (String str : strings) {
            System.out.println(str.toUpperCase());
        }

        console.close();
    }

}
