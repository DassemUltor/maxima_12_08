package lesson_3.task_8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*  Работа светофора для пешеходов запрограммирована следующим образом:
        в начале каждого часа в течение трех минут горит зелёный сигнал,
        затем в течение одной минуты - жёлтый,
        а потом в течение одной минуты - красный,
        затем опять зелёный горит три минуты и т. д.
        Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
        Определить, сигнал какого цвета горит для пешеходов в этот момент.
        Результат вывести на экран в следующем виде:
        "зелёный" - если горит зелёный цвет,
        "жёлтый" - если горит жёлтый цвет,
        "красный" - если горит красный цвет.
     */

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Input value 't' from '1' to '59':");
        double t = console.nextDouble();
        while (t < 1 || t > 59) {
            System.out.println("This number must be between 1 and 59.");
            t = console.nextDouble();
        }

        double cycleTime = t % 5;

        if (cycleTime < 3) {
            System.out.println("Traffic light is green");
        } else if (cycleTime < 4) {
            System.out.println("Traffic light is yellow");
        } else {
            System.out.println("Traffic light is red");
        }

        console.close();

    }
}
