package lesson_6.task_3;

import java.util.Scanner;

public class Main {

/*    1. Создать массив на 10 строк.
      2. Ввести с клавиатуры 8 строк и сохранить их в массив.
      3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
      Каждый элемент - с новой строки.
*/

    public static void main(String[] args) {

        var console = new Scanner(System.in);
        var array = new String[10];

        System.out.println("Enter 8 lines ");

        for (int i = 0; i < 8; i++) {
            array[i] = console.nextLine();
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        console.close();
    }

}
