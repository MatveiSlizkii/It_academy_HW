package home_work_1.Presentation;

import java.util.Random;

public class Presentation1_shet_nechet2 {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 100;
        int min = 0;
        int diff = max - min;
        int num1 = random.nextInt(diff + 1);
        num1 += min;
        int num2 = random.nextInt(diff + 1);
        num2 += min;

        if (num1 % 2 != 0) {
            System.out.println(num1);
        } else if (num2 % 2 != 0) {
            System.out.println(num2);
        } else {
            System.out.println("Оба числа являются четными(((");
        }
    }

}
