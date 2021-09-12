package home_work_2.txt;

import java.util.Scanner;

public class txt_1_2_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int multiplication = 1;
        //181232375
        int numLength = (int) (Math.log10(num) + 1); //длина числа
        for (int i = numLength-1; i > -1 ; i--) {
            int a = num / (int) Math.pow(10, i);
            num = num % (int)  Math.pow(10, i);
            multiplication = multiplication * a;
            System.out.print(a);
            if (i != 0){
                System.out.print( " * ");
            } else {
                System.out.print(" = " + multiplication);
            }

        }


    }

}