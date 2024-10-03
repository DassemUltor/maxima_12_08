package lesson_11.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner console = new Scanner(System.in);

        System.out.println("Array List");
        fillLines(arrayList, console);


        console.close();
    }

    private static void fillLines(List<String> strings, Scanner console) {
        while (strings.size() < 10) {
            strings.addFirst(console.nextLine());

        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
