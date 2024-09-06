package lesson_5.task_5;

import java.util.Scanner;

public class Main {

/*  1. Создать массив на 20 чисел.
    2. Ввести в него значения с клавиатуры.
    3. Создать два массива на 10 чисел каждый.
    4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
    5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        var largeArray = new int[20];
        var smallArray1 = new int[10];
        var smallArray2 = new int[10];

        System.out.println("Enter 20 numbers: ");
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = console.nextInt();
        }

        for (int i = 0; i < largeArray.length; i++) {
            if (i < 10) {
                smallArray1[i] = largeArray[i];
            } else {
                smallArray2[i - 10] = largeArray[i];
            }
        }

        System.out.println("Small Array2: ");
        for (int num : smallArray2) {
            System.out.println(num);
        }

        console.close();
    }
}
