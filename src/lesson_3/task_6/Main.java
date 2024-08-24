package lesson_3.task_6;

import java.util.Scanner;

public class Main {
    /* Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
        , будет определять количество дней в году. Результат вывести на экран в следующем виде:
        количество дней в этом году: x, где
        х - 366 для високосного года,
        х - 365 для обычного года.
    */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input year:");
        int year = console.nextInt();

        if ((year % 400 == 0)
                || ((year % 4 == 0)
                && (year % 100 != 0))) {
            System.out.println(year + " - This year is Leap ");
        } else {
            System.out.println(year + " - This year is not a leap year");
        }
        console.close();
    }
}
