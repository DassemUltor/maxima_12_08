package lesson_4.task_4;

import java.util.Scanner;

public class Main {

//    Вводить с клавиатуры числа.
//    Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//    -1 должно учитываться в сумме.

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Insert numbers: ");

        do {
            number = Integer.parseInt(console.nextLine());
            sum += number;
        } while (number != -1);

        System.out.println("The sum of the entered numbers " + sum);
        console.close();
    }
}
