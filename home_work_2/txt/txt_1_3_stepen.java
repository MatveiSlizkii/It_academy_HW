package home_work_2.txt;

import java.util.Scanner;

public class txt_1_3_stepen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        System.out.println("Введите степень");
        int stepen = scanner.nextInt();
        int answer = num;
        for (int i = 0; i < stepen-1; i++) {
            answer = answer * num;
        }
        System.out.println(answer);
    }
}