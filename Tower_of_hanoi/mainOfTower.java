package Tower_of_hanoi;

import home_work_2.txt.arrays.ArraysUtils;
import home_work_2.txt.arrays.SortUtils;

import java.util.Random;
import java.util.Scanner;

public class mainOfTower {
    public static void main(String[] args) {

        methodsOfTower mOT = new methodsOfTower(); //экспорт методов


        Scanner scanner = new Scanner(System.in);
        System.out.println("В каком режиме игры Вы хотите играть");
        System.out.println("1 - ручной режим");
        System.out.println("2 - автоматический");
        int gameMode = scanner.nextInt();
        boolean checkRange = true;
        int fieldSelection = 0;
        while (checkRange) {
            System.out.println("Укажите количество колец");
            System.out.println("Минимальное - 3, максимальное - 8");
            fieldSelection = scanner.nextInt();

            if (fieldSelection > 8 || fieldSelection < 3) {
                System.out.println("Вы ввели неверный диапозон.");
                System.out.println("Пожалуйста попробуйте еще раз");
                System.out.println();
            } else {
                checkRange = false;
            }
        }
        if (gameMode == 1) {



            int[][] field = mOT.createArray(fieldSelection); //создали массив и заполнили кольцами
            mOT.showArray(field); //показываем поле
            mOT.showOption(); //показывает опции
            boolean gameOver = true;
            boolean fin = false;
            int numStep = 1;
            while (gameOver && !fin) {
                int step1 = scanner.nextInt();
                gameOver = mOT.step(step1, field, gameMode); //делаем ход
                fin = mOT.winner(fieldSelection, numStep, field);
                if (gameOver ) {                                     //костыль
                    numStep += 1;          //счетчик ходов
                    System.out.println("Ход " + numStep + ":");
                    mOT.showArray(field); // показываем доску
                    if (!fin) {
                        mOT.showOption();    // показываем варинты хода
                    }
                }
            }
            if (fin){
                System.out.println("Поздравляем вы прошли игру за " + numStep + " ходов!!!");
            }
        }


        if (gameMode == 2) {
            System.out.println("За работу!");

            int[][] field = mOT.createArray(fieldSelection); //создали массив и заполнили кольцами

            boolean gameOver = true;
            boolean fin = false;
            int numStep = 1;
            while (gameOver && !fin) {
                Random random = new Random();
                int step1 = random.nextInt(6) + 1; //вызываем Бога рандома
                gameOver = mOT.step(step1, field,gameMode); //делаем ход
                fin = mOT.winner(fieldSelection, numStep, field);
                if (gameOver ) {                                     //костыль
                    numStep += 1;          //счетчик ходов
                }
            }
            if (fin){
                mOT.showArray(field); // показываем доску
                System.out.println();
                System.out.println("Компьютер победил за " + numStep + " ходов!!!");
            }



            //Кусок кода
        }
    }
}