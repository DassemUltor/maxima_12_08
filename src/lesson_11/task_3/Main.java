package lesson_11.task_3;

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
            strings.add(console.nextLine());
        }
        String shortest = strings.getFirst();
        String longest = strings.getFirst();

        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        int indexShortest = strings.indexOf(shortest);
        int indexLongest = strings.indexOf(longest);

        if (indexShortest < indexLongest) {
            System.out.println("First shortest line: " + shortest);
        } else {
            System.out.println("First longest line: " + longest);
        }

    }
}
