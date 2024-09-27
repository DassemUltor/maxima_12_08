package lesson_9.task_1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("meat", "at home", "Doberman");
        Animal cat = new Cat("milk", "at home", "Marusa");
        Animal horse = new Horse("avena", "prairie", "Black bay");
        Vet veterinarian = new Vet();

        List<Animal> animals = List.of(dog, cat, horse);
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

    }
}
