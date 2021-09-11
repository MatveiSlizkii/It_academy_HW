package home_work_1.Presentation;

import org.w3c.dom.UserDataHandler;

import java.util.Scanner;

public class Presentation5_Simvol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ");

        String simvol1 = sc.next();
        char simvol = simvol1.charAt(0);
        int code = (int) simvol;

        //определение промежутков
        char A = 'A';
        char Z = 'Z';
        char a = 'a';
        char z = 'z';

        if ((code > (int) A && code < (int) Z) || (code > (int) a && code < (int) z)) {
            System.out.println("Ваш символ буква " + simvol);
        } else {
            System.out.println("Ваш символ не буква");
        }

    }
}
