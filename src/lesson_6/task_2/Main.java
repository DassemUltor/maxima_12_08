package lesson_6.task_2;

import java.util.Scanner;

public class Main {

//    Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

    public static void main(String[] args) {

        var console = new Scanner(System.in);
        var strings = new String[5];


        System.out.println("Enter 5 line");
        for (int i = 0; i < 5; i++) {
            strings[i] = console.nextLine();
        }

        String minLenght = strings[0];
        String maxLenght = strings[0];


        for (String str : strings) {
            if (str.length() < minLenght.length()) {
                minLenght = str;
            }
            if (str.length() > maxLenght.length()) {
                maxLenght = str;
            }
        }

        System.out.println("Shortest line is " + minLenght + " lenght = " + minLenght.length());
        System.out.println("Longest line is " + maxLenght + " lenght = " + maxLenght.length());

        console.close();

    }
}
