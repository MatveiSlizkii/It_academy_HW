package home_work_1.txt;

import java.util.Scanner;

public class Txt4_sleep {


    static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleep = false;
        if (vacation || !weekday) {
           sleep = true;
        }
        return sleep;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("У вас рабочий день?");
        boolean weekday = scanner.nextBoolean();
        System.out.println("У вас отпуск?");
        boolean vacation = scanner.nextBoolean();

        if (sleepIn(weekday, vacation)){
            System.out.println("Спи дальше, расслабь булки");
        } System.out.println("Придется поработать");


    }
}
