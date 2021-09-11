package home_work_2.txt;

import java.util.Scanner;

public class txt_1_1_2_factorial {
    static int factorial(int num) {
        if (num != 0 && num != 1) {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для рассчета факториала этого числа");
        int nums = scanner.nextInt();
        System.out.println(factorial(nums));
    }

    //System.out.println("Факториал числа " + num + "равен " + fact);
}

