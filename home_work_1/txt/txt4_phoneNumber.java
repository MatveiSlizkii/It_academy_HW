package home_work_1.txt;

import java.util.Scanner;

public class txt4_phoneNumber {
    static int[] numbers = new int[10];


    static void createPhoneNumber(int[] numbers) {
//(XXX) XXX-XXX
        System.out.println("(" + numbers[0] + "" + numbers[1] + "" + numbers[2] + ") " + numbers[3] + "" + numbers[4] + "" + numbers[5] + "-" + numbers[6] + "" + numbers[7] + "" + numbers[8] + "" + numbers[9]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш номер");
        int[] yourNumbers1 = new int[10];
        for (int i = 0; i < 10; i++) {
            yourNumbers1[i] = scanner.nextInt();
        }
        txt4_phoneNumber.createPhoneNumber(yourNumbers1);
    }
}
