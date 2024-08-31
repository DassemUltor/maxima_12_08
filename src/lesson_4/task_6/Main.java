package lesson_4.task_6;

import java.util.Scanner;

public class Main {

//    Ввести с клавиатуры строку name.
//    Ввести с клавиатуры дату рождения (три числа): y, m, d.

    public static void main(String[] args) {

        String name;

        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = console.nextLine();
        System.out.print("Enter your birthDate(day): ");
        int dayBirth = console.nextInt();
        System.out.print("Enter your birthDate(month): ");
        int monthBirth = console.nextInt();
        System.out.print("Enter your birthDate(year): ");
        int yearBirth = console.nextInt();

        System.out.printf("My name is: %s %n I was born: %d.%d.%d ", name, dayBirth, monthBirth, yearBirth);


        console.close();
    }
}
