package lesson_5.task_1;

import java.util.Scanner;

public class Main {
/*  1. Создать массив на 10 строк.
    2. Ввести с клавиатуры 8 строк и сохранить их в массив. Для считывания строк используй у сканера метод nextLine()
    3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        var array = new String[10];
        boolean flag = true;
        int counter = 0;

        while (flag) {
            if (counter == 8) {
                flag = false;
            } else {
                System.out.print("Enter lines: ");
                array[counter] = console.nextLine();
                counter++;
            }
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        console.close();
    }
}
