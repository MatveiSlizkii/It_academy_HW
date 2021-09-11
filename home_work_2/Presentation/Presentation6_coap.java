package home_work_2.Presentation;

import java.util.Scanner;

public class Presentation6_coap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int length = (int) (Math.log10(num) + 1);
        for (int i = 0; i < length; i++) {
            int a = num % 10;
            num = num / 10;
            System.out.print(a);
        }
    }
}

