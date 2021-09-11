package home_work_2.Presentation;

import java.util.Scanner;

public class Presentation2_probability_chet {
    public static void main(String[] args) throws java.lang.Exception {
        int chet = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел для проверки генератора");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            int num = (int) (Math.random() * 100);
            if (num % 2 == 0) {
                chet += 1;
            }
        }
        float probability = chet / length;
        System.out.println("вероятность выпадения случайных чисел = " + ((double) chet / length) * 100 + " %");
    }
}
