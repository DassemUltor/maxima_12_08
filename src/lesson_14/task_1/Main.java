package lesson_14.task_1;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "Sergey");
        map.put("Petrov", "Alexandr");
        map.put("Sidorov", "Ivan");
        map.put("Petrov", "Nikolay");
        map.put("Korolkov", "Bogdan");
        map.put("Plehanova", "Eugenia");
        map.put("Ivanov", "Alexey");
        map.put("Obrazcov", "Nikolay");
        map.put("Melnik", "Pavel");
        map.put("Voronina", "Eugenia");

        System.out.println(map);
    }


}
