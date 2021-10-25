package home_work_2.presentation;

import java.util.Scanner;

public class Presentation5_step {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимум ");
        int min = scanner.nextInt();
        System.out.println("Введите максимум ");
        int max = scanner.nextInt();
        System.out.println("Укажите шаг ");
        int step = scanner.nextInt();
        int a = min;
        int b = 0;
        System.out.print(min + " ");
        while (b < max) {
            a += step;
            b = a + step;
            System.out.print(a + " ");
        }
    }
}

