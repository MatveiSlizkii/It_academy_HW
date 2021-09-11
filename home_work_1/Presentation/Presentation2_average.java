package home_work_1.Presentation;

import java.util.Random;
import java.util.Scanner;

public class Presentation2_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        System.out.println("Введите третье число");
        int num3 = sc.nextInt();
        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            System.out.println("Среднее число " + num1);
        } else if ((num2 > num3 && num2 < num1) || (num2 < num3 && num2 > num1)) {
            System.out.println("Среднее число " + num2);
        } else {
            System.out.println("Среднее число " + num3);
        }
    }
}

