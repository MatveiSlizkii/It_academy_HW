package home_work_1.Presentation;

import java.util.Scanner;

public class Presentation3_delimost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        if (num1 % num2 == 0) {
            System.out.println("Число " + num1 + " нацело делится на " + num2);
        } else {
            System.out.println("Число " + num1 + " не делится нацело на " + num2);
            System.out.println("Частное = " + num1 / num2);
            System.out.println("Остаток = " + num1 % num2);
        }
    }
}

