package home_work_1.txt;

import java.util.Scanner;

public class Txt4_phoneNumber {
    public static void createPhoneNumber(int[] numbers) {
//(XXX) XXX-XXX
        System.out.println("(" + numbers[0] + "" + numbers[1] + "" + numbers[2] + ") " + numbers[3] + "" + numbers[4] + "" + numbers[5] + "-" + numbers[6] + "" + numbers[7] + "" + numbers[8] + "" + numbers[9]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш номер");
        int yourNumber = scanner.nextInt();

        int[] yourNumbers = new int[10];                    //создаем массив разбиваем на числа
        for (int i = yourNumbers.length - 1; i > -1; i--) {
            int a = yourNumber % 10;
            yourNumber = yourNumber / 10;
            yourNumbers[i] = a;
        }
        Txt4_phoneNumber.createPhoneNumber(yourNumbers);
    }
}
