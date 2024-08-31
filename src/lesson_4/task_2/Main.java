package lesson_4.task_2;

public class Main {

//    Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
