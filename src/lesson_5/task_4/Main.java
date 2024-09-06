package lesson_5.task_4;

import java.util.Scanner;

public class Main {
/*  1. Создать массив на 10 чисел.
    2. Ввести с клавиатуры 10 чисел и записать их в массив.
    3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 */

    public static void main(String[] args) {

        var array = new int[10];
        boolean flag = true;
        int counter = 0;
        Scanner console = new Scanner(System.in);

        while (flag) {
            if (counter == array.length) {
                flag = false;
            } else {
                System.out.print("Enter numbers: ");
                array[counter] = console.nextInt();
                counter++;
            }
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        console.close();
    }
}
