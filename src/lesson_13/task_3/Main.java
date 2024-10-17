package lesson_13.task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> fix(List<String> list) {

        return list.stream()
                .filter(str -> !str.contains("р")
                        || str.contains("л"))
                .map(str -> {
                    if (str.contains("л")
                            && !str.contains("р")) {
                        return str + str;
                    }
                    return str;
                })
                .toList();
    }


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        fix(strings).forEach(System.out::println);

    }
}
