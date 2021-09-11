package home_work_1.Presentation;

import java.util.Objects;
import java.util.Scanner;

public class Presentation4_b_kb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int num1 = sc.nextInt();
        System.out.println("Перевести в байты(b) или килобайты(k)");
        String bk = sc.next();
        if (Objects.equals(bk, "b")) {
            System.out.println("В байтах = " + num1 * 1024);
        } else if (Objects.equals(bk, "k")) {
            System.out.println("В килобайтах = " + num1 / 1024);
        } else {
            System.out.println("Вы неверно ввели во что хотите перевести ваше число");
        }
    }
}
