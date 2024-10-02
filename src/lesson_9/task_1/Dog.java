package lesson_9.task_1;

public class Dog extends Animal {

    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof - woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public String getBreed() {
        return breed;
    }
}
