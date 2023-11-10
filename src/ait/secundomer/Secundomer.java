package ait.secundomer;
/*Функционал:

При старте начинается отсчет времени.
При остановке показывается время с момента старта.
Интерфейс:

Команды старт и стоп через консоль.
Вывод времени с момента старта до остановки.

 */



import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Secundomer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Set Start:  S ");
        long minutes = scanner.nextInt();
        String str = scanner.nextLine();
        printEachSec(str);

        System.out.println("Set seconds");
        long seconds = scanner.nextInt();
        int start = 0;
    }
        public static void printEachSec(String str) {
            int start=0;
            while (!finish) {
                sleep(1000);
                System.out.println(start++);
            }
            System.out.println("Time is over");
        }
        public static void finish(String f){
            System.out.println("Set");
        }

        public static void sleep(long sleepDurationINMs) {
            try {
                Thread.sleep(sleepDurationINMs);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


