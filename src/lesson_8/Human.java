package lesson_8;

public class Human {

    private String name;
    private int age;
    private boolean sex;
    private Human father;
    private Human mother;

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, int age, boolean sex, Human father, Human mother) {
        this(name, sex, age);
        this.father = father;
        this.mother = mother;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + (sex ? "man" : "woman") +
                ", father=" + father +
                ", mother=" + mother +
                '}';
    }
}

