package lesson_6.task_4;

import java.util.Scanner;

public class Main {
/*  1. Создать массив на 10 строк.
    2. Создать массив на 10 чисел.
    3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
    4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
     которой совпадает с текущим индексом из массива чисел.
 */

    public static void main(String[] args) {


        var console = new Scanner(System.in);
        var stringArray = new String[10];
        var numbersArray = new int[10];

        System.out.println("Enter 10 lines");
        for (int i = 0; i < 10; i++) {
            stringArray[i] = console.nextLine();
            numbersArray[i] = stringArray[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(stringArray[i] + " : " + numbersArray[i]);
        }

        console.close();
    }
}


