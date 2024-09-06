package lesson_5.task_6;

import java.util.Scanner;

public class Main {
/*  Создать массив на 20 чисел.
    Заполнить его числами с клавиатуры.
    Найти максимальное и минимальное числа в массиве.
    Вывести на экран максимальное и минимальное числа через пробел.
 */

    public static void main(String[] args) {

        var array = new int[20];
        Scanner console = new Scanner(System.in);

        System.out.println("Enter 20 numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int number : array) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println(min + " " + max);

        console.close();
    }

}
