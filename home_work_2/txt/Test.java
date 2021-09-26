package home_work_2.txt;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double subtotal = 0.0;
        System.out.println("Введи");
        if (scanner.hasNextDouble()){
            subtotal = scanner.nextDouble();
            System.out.println("Вы ввели число");
            System.out.println(subtotal);
        }





    }
}
