package lesson_9.task_3;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Ivanov Alexandr Sergeevich", 27);

        System.out.println(person1);
        person1.talk();
        person1.move();
        System.out.println(person2);
        person2.talk();
        person2.move();
    }
}
