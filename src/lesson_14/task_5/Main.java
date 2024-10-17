package lesson_14.task_5;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", (long) 56);
        map.put("Food", '3');
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        map.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
