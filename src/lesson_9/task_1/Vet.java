package lesson_9.task_1;

public class Vet {

    void treatAnimal(Animal animal) {
        System.out.printf((animal.getClass().getSimpleName()) + " - Location: %s. Food: - %s\n", animal.location, animal.food);
    }
}
