package lesson_4.task_5;

public class Main {

//    Вывести на экран таблицу умножения 10х10 используя цикл while.
//    Числа разделить пробелом.

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            int j = 1;

            while (j <= 10) {
                System.out.print(i * (j++) + " ");

            }
            System.out.println();
            i++;
        }
    }
}


