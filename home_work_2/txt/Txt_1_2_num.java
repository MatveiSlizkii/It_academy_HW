package home_work_2.txt;

import java.util.Scanner;

public class Txt_1_2_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = 0;
        boolean scanerInt = true;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else if (scanner.hasNextDouble()) {
            System.out.println("Введено не целое число");
            scanerInt = false;
        } else {
            System.out.println("Введено не число");
            scanerInt = false;
        }

        if (scanerInt) {
            int multiplication = 1;
            //181232375
            int numLength = (int) (Math.log10(num) + 1); //длина числа
            for (int i = numLength - 1; i > -1; i--) {
                int a = num / (int) Math.pow(10, i);
                num = num % (int) Math.pow(10, i);
                multiplication = multiplication * a;
                System.out.print(a);
                if (i != 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" = " + multiplication);
                }

            }


        }
    }

}