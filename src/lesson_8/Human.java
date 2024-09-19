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


    public void printInfo() {
        String fatherName = ((father == null) ? "unkown" : father.name);
        String motherName = ((mother == null) ? "unkown" : mother.name);
        String sexString = (sex ? "man" : "woman");
        System.out.printf("Name: %s, age: %d, sex: %s, father: %s, mother: %s " +
                "\n", name, age, sexString, fatherName, motherName);

    }
}

