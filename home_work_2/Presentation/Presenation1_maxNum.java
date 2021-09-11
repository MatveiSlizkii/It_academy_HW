package home_work_2.Presentation;

import java.util.Scanner;

public class Presenation1_maxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int length = (int) (Math.log10(num)+1);
        for (int i = 0; i < length && a != 9; i++) {
            if (a < num % 10) {
                a = num % 10;
                num = num / 10;
            } else {
                num = num / 10;
            }
        }
        System.out.println("Наибольшая цифра = " + a);
    }
}
