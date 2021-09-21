package home_work_1.txt;


import java.util.Scanner;

public class Txt5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свое имя");
        String name = scanner.next();
        switch (name) {
            case "Вася":
                System.out.println("Привет!" + System.lineSeparator() + "Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а Вы кто?");
        }


    }
}
