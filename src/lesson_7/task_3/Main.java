package lesson_7.task_3;

public class Main {

//    Необходимо написать метод, который бы возвращал из 2 чисел меньшее число.
//    Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.

    public static void main(String[] args) {

        System.out.println(getLess(7, 3));

    }

    public static int getLess(int a, int b) {
        if (a > b)
            return b;
        else
            return a;
    }
}
