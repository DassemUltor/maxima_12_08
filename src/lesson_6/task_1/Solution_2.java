package lesson_6.task_1;

import java.util.Scanner;

public class Solution_2 {

//    Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//Программа выводит слова на экран

    public static void main(String[] args) {

        var console = new Scanner(System.in);

        System.out.println("Enter lines. To exit, enter empty line");
        StringBuilder input;


        while (true) {
            input = new StringBuilder(console.nextLine());
            if (input.isEmpty()) {
                break;
            }
            int length = input.length();

            if (length % 2 == 0) {
                input.append(input);
            } else {
                input.append(input).append(input);
            }

            System.out.println(input);
        }

        console.close();
    }


}


