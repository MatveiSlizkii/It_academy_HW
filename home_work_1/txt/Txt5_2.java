package home_work_1.txt;

import java.util.Objects;
import java.util.Scanner;

public class Txt5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свое имя");
        String name = scanner.next();
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!" + System.lineSeparator() + "Я тебя так долго ждал");
        } else if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а Вы кто?");
        }

    }
}
