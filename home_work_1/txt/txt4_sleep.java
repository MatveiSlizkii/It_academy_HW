package home_work_1.txt;

import java.util.Scanner;

public class txt4_sleep {
    static boolean sleep;

    static void sleepIn(boolean weekday, boolean vacation) {
        if (vacation || !weekday) {
            sleep = true;
        }
        System.out.println(sleep);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("У вас рабочий день?");
        boolean Weekday = scanner.nextBoolean();
        System.out.println("У вас отпуск?");
        boolean Vacation = scanner.nextBoolean();

        System.out.println("Стоит ли вам спать?");
        txt4_sleep.sleepIn(Weekday, Vacation);

    }
}
