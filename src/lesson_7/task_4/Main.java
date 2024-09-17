package lesson_7.task_4;

public class Main {

/*  Написать метод, который будет принимать число и степень.
    В этом методе нужно два раза вызвать ДРУГОЙ МЕТОД, который вернет число в заданной степени.
    А затем сложить результаты двух вызовов и вывести в консоль.
*/

    public static void main(String[] args) {

        someMethod(5, 3);
    }

    public static void someMethod(int n, int degree) {
        int result1 = raiseToDegree(n, degree);
        int result2 = raiseToDegree(n, degree);
        System.out.println(result1 + result2);
    }

    public static int raiseToDegree(int n, int degree) {
        if (degree == 0) {
            return 1;
        }
        return n * (raiseToDegree(n, degree - 1));
    }

}
