package home_work_2.Presentation;

import java.util.Scanner;

public class Presentation4_fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько элементов вывессти ");
        int length = scanner.nextInt();
        int num1 = 1;
        int num2 = 2;
        if (length == 1) {
            System.out.print("1 ");
        } else {
            System.out.print("1 2 ");
        }

        for (int i = 0; i < length - 2; i++) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}
