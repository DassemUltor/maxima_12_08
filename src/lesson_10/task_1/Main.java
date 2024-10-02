package lesson_10.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);

        }

    }
}
