package Tower_of_hanoi;

import home_work_2.txt.arrays.ArraysUtils;
import home_work_2.txt.arrays.SortUtils;

import java.util.Scanner;

public class mainOfTower {
    public static void main(String[] args) {

        methodsOfTower mOT = new methodsOfTower(); //экспорт методов


        Scanner scanner = new Scanner(System.in);
        System.out.println("В каком режиме игры Вы хотите играть");
        System.out.println("1 - ручной режим");
        System.out.println("2 - автоматический");
        int gameMode = scanner.nextInt();
        if (gameMode == 1) {
            System.out.println("Укажите количество колец");
            System.out.println("Минимальное - 3, максимальное - 8");
            int fieldSelection = scanner.nextInt();
            int[][] field = mOT.createArray(fieldSelection); //создали массив и заполнили кольцами
            mOT.showArray(field); //показываем поле
            mOT.showOption(); //показывает опции
            int step1 = scanner.nextInt(); //ввод номера шага (думаем что пользователь не кривожоп)
            while (step1 > 7 && step1 < 1) {    // забацать из него метод для рекурсии
                System.out.println("Вы ввели неверный вариант ответа, попробуйте еще раз");
                step1 = scanner.nextInt();
            }
            mOT.step(step1, field); //делаем ход
            mOT.showArray(field);
            mOT.showOption();
            step1 = scanner.nextInt();
            mOT.step(step1, field); //делаем ход
            mOT.showArray(field);
            step1 = scanner.nextInt();
            mOT.step(step1, field); //делаем ход
            mOT.showArray(field);

        }


        if (gameMode == 2) {
            System.out.println("Данный режим находится на стадии разработки");
            //Кусок кода
        }
    }
}