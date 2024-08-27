package lesson_3.task_4;

import java.util.Scanner;

public class Main {
    /* Написать программу, которая будет проверять число, которое мы подадим ей.
        Если число положительное, то увеличить его в два раза.
        Если число отрицательное, то прибавить единицу.
        Если введенное число равно нулю, необходимо вывести ноль.
        Вывести результат в консоль.
     */


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int result;

        System.out.println("Input number:");
        int input = console.nextInt();

        result = switch (Integer.compare(input, 0)) {
            case 1 -> input * 2;
            case -1 -> input + 1;
            default -> 0;
        };

        System.out.println("Result: " + result);
        console.close();
    }


}
