package lesson_5.task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
/*  1. Создать массив на 10 строк.
    2. Создать массив на 10 чисел.
    3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
    4. В каждую ячейку массива чисел записать длину строки из массива строк,
    индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
    Для нахождения длины строки используй у конкретного слова вызов метода length()
*/

    public static void main(String[] args) {

        var arrayLines = new String[10];
        var arrayNumbers = new int[10];
        var console = new Scanner(System.in);

        System.out.print("Enter lines: ");
        for (int i = 0; i < arrayLines.length; i++) {
            arrayLines[i] = console.nextLine();
            arrayNumbers[i] = arrayLines[i].length();

        }
        console.close();
        System.out.println(Arrays.toString(arrayNumbers));
    }
}
