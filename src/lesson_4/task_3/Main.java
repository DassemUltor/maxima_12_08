package lesson_4.task_3;

import java.util.Scanner;

public class Main {

//   Ввести с клавиатуры три числа, вывести на экран среднее из них.
//   Т.е. не самое большое и не самое маленькое.
//   Если все числа равны, вывести любое из них.

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());


        if (a == b && b == c) {
            System.out.println("All numbers are equal " + a);
        } else if (a == b || b == c || c == a) {
            System.out.println("Two of three numbers are equal to each other");
        } else {
            if ((a > b && a < c) || (a < b && a > c)) {
                System.out.println("Average number is " + a);
            } else if ((b > a && b < c) || (b < a && b > c)) {
                System.out.println("Average number is " + b);
            } else {
                System.out.println("Average number is " + c);
            }
        }


    }

}
