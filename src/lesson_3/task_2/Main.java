package lesson_3.task_2;

import java.util.Scanner;

public class Main {

    /* Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
"Число number не содержится в интервале." или "Число number содержится в интервале.", где number - число, которое мы ей подадим.
     */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input number:");
        int input = console.nextInt();

        if (input >= 50 && input <= 100) {
            System.out.println("The number is in the specified range");
        } else {
            System.out.println("The number is not in the specified range");
        }
        console.close();
    }
}
