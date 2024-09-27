package lesson_9.task_1;

public class Horse extends Animal {
    String hairyCoat;

    public Horse(String food, String location, String hairyCoat) {
        super(food, location);
        this.hairyCoat = hairyCoat;
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh-neigh");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating ");
    }


}
