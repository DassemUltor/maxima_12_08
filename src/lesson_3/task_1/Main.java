package lesson_3.task_1;

import java.util.Scanner;

public class Main {
    /*Написать программу, чтобы она:
    - выводил на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
    - выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
    - выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.
     */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input number:");
        int input = console.nextInt();

        if (input > 5) {
            System.out.println("The number is greater than 5");
        } else if (input < 5) {
            System.out.println("The number is less than 5");
        } else {
            System.out.println("The number is equal to 5");
        }
        console.close();

    }
}
