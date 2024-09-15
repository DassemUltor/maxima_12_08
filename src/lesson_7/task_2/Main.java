package lesson_7.task_2;

public class Main {
/*
    Напишите метод, который бы возвращал в консоль:
    true, если число больше 5
    и false, если число меньше 5
*/

    public static void main(String[] args) {

        contrast(7);

    }

    public static void contrast(int n) {
        if (n > 5) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
