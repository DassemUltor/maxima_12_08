package lesson_5.task_2;

import java.util.Scanner;

public class Main {
/*  1.1. Создай массив на 10 чисел
    1.2. Считай с консоли 10 чисел и заполни ими массив
    2. Найти максимальное число из элементов массива
*/

    public static void main(String[] args) {

        var array = new int[10];
        int max = Integer.MIN_VALUE;
        var console = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        console.close();
        System.out.println("Maximum number is: " + max);
    }
}
