package home_work_2.Presentation;

import java.util.Arrays;
import java.util.Scanner;

public class Presentation11_interval {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a диапозона [a,b]");
        int a = scanner.nextInt();
        System.out.println("Введите b диапозона [a,b]");
        int b = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }

    }
}
