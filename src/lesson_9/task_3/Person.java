package lesson_9.task_3;

public class Person {
    private String fullName;
    private int age;

    public void move() {
        System.out.println(fullName + " is moving");
    }

    public void talk() {
        System.out.println(fullName + " is talking ");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person - " +
                "fullName = " + (fullName == null ? "unkown" : fullName) +
                ", age = " + (age == 0 ? "unkown" : age);
    }
}
