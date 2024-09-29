package lesson_9.task_1;

public class Cat extends Animal {
    private String name;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow - meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    public String getName() {
        return name;
    }
}
