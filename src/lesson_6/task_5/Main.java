package lesson_6.task_5;

import java.util.Scanner;

public class Main {

//    1. Считать 6 строк и заполнить ими массив strings.
//    2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null")

    public static void main(String[] args) {

        var console = new Scanner(System.in);
        var stringArray = new String[6];

        System.out.println("Enter 6 lines");
        for (int i = 0; i < 6; i++) {
            stringArray[i] = console.nextLine();
        }

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = i + 1; j < stringArray.length; j++) {
                if (stringArray[i] != null && stringArray[i].equals(stringArray[j])) {
                    stringArray[j] = null;
                }
            }
        }
        for (String s : stringArray) {
            System.out.println(s);
        }

        console.close();
    }
}

