package lesson_15;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    private static Random random = new Random();

    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(50) + 1;
            set.add(randomNumber);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        return set.stream()
                .filter(x -> x <= 10)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {

        Set<Integer> set = createSet();
        Set<Integer> set2 = removeAllNumbersGreaterThan10(set);

    }
}
