package home_work_2.Presentation;

import java.util.Scanner;

public class Presentation3_chet_nechet_in_num {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int length = (int) (Math.log10(num) + 1);
        int chet = 0;
        int nechet = 0;

        for (int i = 0; i < length; i++) {
            int check = num % 10;
            num = num / 10;
            if (check % 2 == 0) {
                chet += 1;
            } else {
                nechet += 1;
            }
        }
        System.out.println("Четных чисел = " + chet + ", нечетных = " + nechet);
    }
}
