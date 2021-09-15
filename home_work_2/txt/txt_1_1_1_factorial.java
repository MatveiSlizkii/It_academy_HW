package home_work_2.txt;

import java.util.Scanner;

public class txt_1_1_1_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для рассчета факториала этого числа");
        int num = scanner.nextInt();
        int fact = 1;
        boolean isCrowded = false;
        for (int i = 1; i < num + 1; i++) {
            fact = fact * i;
            try {
                Math.multiplyExact(fact, i);
            } catch (ArithmeticException e) {
                System.out.println("так то переполнено");
                isCrowded = true;
                break;
            }


        }
        if (!isCrowded) {
            System.out.println("Факториал числа " + num + " равен " + fact);
        }
    }
}
