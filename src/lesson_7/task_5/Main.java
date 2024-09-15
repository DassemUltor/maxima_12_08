package lesson_7.task_5;

import java.util.Scanner;

public class Main {

 /*
        Необходимо написать простой консольный калькулятор на Java.

        Метод int getInt() - должен считывать с консоли целое число и возвращать его
        Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать
        символ с операцией (+, -, * или /)
        Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2
        арифметическую операцию, заданную operation.
        Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(),
        передать все методу calc() и вывести на экран результат.
 */

    public static void main(String[] args) {

        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();

        double result = calc(num1, num2, operation);
        System.out.println("Result: " + result);

    }

    public static int getInt() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        return console.nextInt();
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static double calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / num2;
            default:
                System.out.println("Invalid operation");
                return 0;
        }

    }
}

