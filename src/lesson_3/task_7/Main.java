package lesson_3.task_7;

import java.util.Scanner;

public class Main {
    /* Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
        Определить возможность существования треугольника по сторонам.
        Результат вывести на экран в следующем виде:
        "Треугольник существует." - если треугольник с такими сторонами существует.
        "Треугольник не существует." - если треугольник с такими сторонами не существует.
     */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Input side a: ");
        int a = console.nextInt();
        System.out.print("Input side b: ");
        int b = console.nextInt();
        System.out.print("Input side c: ");
        int c = console.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("The triangle exists");
        } else {
            System.out.println("The triangle does not exist");
        }

        console.close();
    }
}

