package lesson_13.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        while (list.size() < 5) {
            list.add(console.nextLine());
        }
        list.remove(2);
        List<String> reversed = list.reversed();
        reversed.forEach(System.out::println);

        console.close();
    }
}
