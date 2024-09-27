package lesson_9.task_1;

abstract class Animal {


    String food;
    String location;

    protected Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Animal makes noise");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }


    public void sleep() {
        System.out.println("Animal is sleeping");
    }

}
