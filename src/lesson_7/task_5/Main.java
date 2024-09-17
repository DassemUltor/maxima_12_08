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
        Scanner console = new Scanner(System.in);
        int num1 = getInt(console);
        int num2 = getInt(console);
        char operation = getOperation(console);

        double result = calc(num1, num2, operation);
        System.out.println("Result: " + result);

        console.close();

    }

    public static int getInt(Scanner scanner) {
        System.out.println("Enter integer number: ");
        return scanner.nextInt();
    }

    public static char getOperation(Scanner scanner) {
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
                if (num2 != 0) {
                    return (double)num1 / num2;
                } else {
                    throw new ArithmeticException("Divide by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operation " + operation);
        }

    }
}

