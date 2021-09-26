package home_work_2.txt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Txt_1_4_multiplyExact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На что надо умножать 1");
        long x = scanner.nextLong();
        boolean isCrowded = false;
        long a = 1;
        while (!isCrowded) {
        a = a * x;
            try {
                Math.multiplyExact(a, x);
            } catch (ArithmeticException e) {
                System.out.println("до переполнения = " + a);
                System.out.println("после переполнения = " + (a * x));


                isCrowded = true;
            }
        }

    }
}