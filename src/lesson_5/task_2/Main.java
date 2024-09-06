package lesson_5.task_2;

import java.util.Scanner;

public class Main {
/*  1.1. Создай массив на 10 чисел
    1.2. Считай с консоли 10 чисел и заполни ими массив
    2. Найти максимальное число из элементов массива
*/

    public static void main(String[] args) {

        var array = new int[10];
        int max = 0;
        boolean flag = true;
        int counter = 0;
        Scanner console = new Scanner(System.in);

        while (flag) {
            if (counter == array.length) {
                flag = false;
            } else {
                System.out.print("Enter numbers: ");
                array[counter] = console.nextInt();
                if (array[counter] > max) {
                    max = array[counter];
                }
                counter++;
            }
        }
        console.close();
        System.out.println("Maximum number is: " + max);
    }
}
