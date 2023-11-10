package ait.timer;

import java.time.LocalTime;
import java.util.Scanner;

/*Функционал:

Пользователь может задать время в минутах и секундах.
После старта отсчет времени идет в обратном порядке.
По истечении времени выводится уведомление в консоль.
Интерфейс:

Ввод времени через консоль.
Вывод оставшегося времени в консоль каждую секунду.
Вывод сообщения о завершении времени.

 */
public class Timer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set minutes");
        long minutes = scanner.nextLong();
//        System.out.println("Set seconds");
//        long seconds = scanner.nextLong();

        printEachSec(minutes);
    }

    public static void printEachSec(long minutes) {
        long totalTime = (minutes * 60) * 1000;
        while (totalTime > 0) {
            sleep(1000);
            totalTime -= 1000;
            long remaningMinutes = totalTime / (60 * 1000);
            long remaningSeconds = (totalTime % (60 * 1000)) / 1000;
            System.out.println("Time left: " + remaningMinutes + " minutes " + remaningSeconds + " seconds ");

        }
        System.out.println(" Time is over ");
    }

    public static void sleep(long sleepDurationInMs) {
        try {
            Thread.sleep(sleepDurationInMs);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}



