package lesson_4.task_6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

//    Ввести с клавиатуры строку name.
//    Ввести с клавиатуры дату рождения (три числа): y, m, d.

    public static void main(String[] args) {

        String name;
        String birthDate;

        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = console.nextLine();
        System.out.print("Enter your birthDate(d.m.y): ");
        birthDate = console.nextLine();

        System.out.println("My name is " + name);
        System.out.println("I was born " + birthDate);

        console.close();
    }
}
