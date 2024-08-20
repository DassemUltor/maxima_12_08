package lesson_2;

public class Main {
    public static void main(String[] args) {

//        Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
        double cash = 5;
        System.out.println("В каждой кассе будет: " + (cash / 2) + " руб.");

        System.out.println();

        //       Задача 2. Дано: Стороны квадрата a1 = 50, b1 = 20. Найти площадь.

        int a1 = 50;
        int b1 = 40;
        System.out.println("Очень странный квадрат имеющий разные стороны, " +
                "но площадь этой фигуры равна: " + (a1 * b1));

        System.out.println();

//        Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
//        насколько быстрее голодный Вася съедает один банан?

        int hungryTimePerThreeBananas = 9;
        int fullTimePerThreeBananas = 15;
        int amountBanana = 3;
        int bananaPerMinuteHungry = hungryTimePerThreeBananas / amountBanana;
        int bananaPerMinuteFull = fullTimePerThreeBananas / amountBanana;
        System.out.println("Голодный Василий съедает банан на " +
                (bananaPerMinuteFull - bananaPerMinuteHungry) + " минуты быстрее, чем сытый");

        System.out.println();

//        Задача 4. Закомментируй часть кода, чтобы на экран вывелось сообщение "sum = 12"
        int a = 3;
//                int a = 10;
        int b = 6;
//                int b = 12;
//                int sum = 1 + a + b;
//                int sum = 2 + a + b;
        int sum = 3 + a + b;
//                int sum = 4 + a + b;


        System.out.println("sum = " + sum);
    }
}
