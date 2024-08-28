package lesson_4.task_1;

import java.util.Scanner;

public class Main {

//  Ввести с клавиатуры два числа m и n.
//  Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Input 'm' : ");
        int m = console.nextInt();

        System.out.println("Input 'n' : ");
        int n = console.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        console.close();
    }

}
