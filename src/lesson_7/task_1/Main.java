package lesson_7.task_1;

public class Main {

//    Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб.

    public static void main(String[] args) {
        System.out.println(toCube(10));
    }

    public static int toCube(int n) {
        return (n * n * n);
    }
}
