package lesson_3.task_3;

import java.util.Scanner;

public class Main {
    /* 3 Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень)
     и вывести на экран.
     */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input the month number:");
        int input = console.nextInt();

        switch (input) {
            case 12, 1, 2:
                System.out.println("This month of winter");
                break;
            case 3, 4, 5:
                System.out.println("This month of spring");
                break;
            case 6, 7, 8:
                System.out.println("This month of summer");
                break;
            case 9, 10, 11:
                System.out.println("This month of fall");
                break;
            default:
                System.out.println("Invalid month number");
                break;

        }
        console.close();
    }
}
