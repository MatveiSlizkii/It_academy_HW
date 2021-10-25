package home_work_1.presentation;

import java.util.Scanner;

public class Presentation6_LeapYear1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите интересующий ваш год");

        int year = sc.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " год високосный");
            } else {
                System.out.println(year + " год обычный");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год обычный");
        }





    }
}
