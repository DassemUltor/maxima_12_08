package lesson_8;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Human h1 = new Human("Nikolay", true, 60);
        Human h2 = new Human("Viktor", true, 72);
        Human h3 = new Human("Vasilisa", false, 63);
        Human h4 = new Human("Anna", false, 56);

        Human h5 = new Human("Sergey", 38, true, h1, h3);
        Human h6 = new Human("Alice", 39, false, h2, h4);

        Human h7 = new Human("Pavel", 18, true, h5, h6);
        Human h8 = new Human("Andrey", 16, true, h5, h6);
        Human h9 = new Human("Katty", 14, false, h5, h6);


        List<Human> family = List.of(h1, h2, h3, h4, h5, h6, h7, h8, h9);


        for (Human human : family) {
            human.printInfo();
        }

    }
}
