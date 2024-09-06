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
        Scanner console = new Scanner(System.in);
        boolean flag = true;
        int counter = 0;

        while (flag) {
            if (counter == arrayLines.length) {
                flag = false;
            } else {
                System.out.print("Enter lines: ");
                arrayLines[counter] = console.nextLine();
                arrayNumbers[counter] = arrayLines[counter].length();
                counter++;
            }
        }
        console.close();
        System.out.println(Arrays.toString(arrayNumbers));
    }
}
