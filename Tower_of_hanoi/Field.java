package Tower_of_hanoi;

import java.util.Scanner;

public class Field {


    public static boolean CheckRange(int fieldSelection) {
        boolean checkRange = true;
        if (fieldSelection > 8 || fieldSelection < 3) {
            System.out.println("Вы ввели неверный диапозон.");
            System.out.println("Пожалуйста попробуйте еще раз");
            System.out.println();
            checkRange = false;
        }
        return checkRange;
    } // ввели количество колец, вернули число колец

    public static int[][] CreateArray(int fieldSelection) {
        int[][] fieldGame = new int[fieldSelection + 1][3]; //создали массив
        for (int i = fieldSelection + 1; i > 0; i--) {  //расставляем кольца
            fieldGame[i - 1][0] = i - 1;
        }
        return fieldGame;
    } //создали массив, вернули массив

    public static void ShowArray(int[][] fieldGame) { // показываем игровое поле

        for (int i = 0; i < fieldGame.length; i++) {                       //идём по строкам
            for (int j = 0; j < 3; j++) {                               //идём по столбцам
                if (fieldGame[i][j] == 0) {
                    System.out.print("    " + "|" + "    ");
                } else {
                    System.out.print("    " + fieldGame[i][j] + "    ");  //вывод элемента
                }
            }
            System.out.println();                               //перенос строки ради визуального сохранения табличной формы
        }

    } //показываем поле

    public static void ShowOption() { // показываем варианты действий

        System.out.println("1) 1=>2   3)2=>1  5) 3=>1");
        System.out.println("2) 1=>3   4)2=>3  6) 3=>2");
        System.out.println("   7) Закончить игру    ");
        System.out.println();
        System.out.println("Сделайте ход");

    } // показываем варианты действий

    // игрок вводит вариант действия
    public static int Xa(int step) {
        int xa = 0;
        switch (step) {
            case 1:
                xa = 0;
                break;
            case 2:
                xa = 0;
                break;
            case 3:
                xa = 1;
                break;
            case 4:
                xa = 1;
                break;
            case 5:
                xa = 2;
                break;
            case 6:
                xa = 2;
                break;
        }
        return xa;
    } // понимает из какого столбца брать кольцо

    public static int Xb(int step) {
        int xb = 0;
        switch (step) {
            case 1:
                xb = 1;
                break;
            case 2:
                xb = 2;
                break;
            case 3:
                xb = 0;
                break;
            case 4:
                xb = 2;
                break;
            case 5:
                xb = 0;
                break;
            case 6:
                xb = 1;
                break;
        }
        return xb;
    } // понимает в какой столбец вставлять кольцо

    public static boolean Exit(int step) {
        boolean exit = false;
        if (step == 7) {
            exit = true;
        }
        return exit;
    } // если пользователь решил выйти

    // надо найти необходимые кольца в столбцах
    // для этого нужен сам массив и координаты Xa
    public static int Ya(int Xa, int[][] fieldGame) {
        int ya = 0;
        for (int i = fieldGame.length - 1; i > 0; i--) {      //находим кольцо которое надо переставить
            if (fieldGame[i][Xa] > fieldGame[i - 1][Xa] && fieldGame[i][Xa] != 0) {
                ya = i;
            }

        }
        return ya;
    } //находит координату кольца по Y в А столбце


    public static int Yb(int Xb, int[][] fieldGame) {
        int yb = 0;
        for (int i = fieldGame.length - 1; i > 0; i--) { //находим свободное место там куда хотим перемести кольцо
            if (fieldGame[i][Xb] == 0) {
                yb = i;
                i = 0;
            }
        }
        return yb;
    } //находит координату кольца по Y в B столбце

    // далее делаем проверку можно ли передвинуть кольцо
    // нужно ввести воординаты и само поле
    public static boolean CorrectStep(int Xa, int Ya, int Xb, int Yb, int[][] fieldGame) {
        boolean correctStep = false;
        if ((Yb == fieldGame.length - 1) || fieldGame[Ya][Xa] < fieldGame[Yb + 1][Xb]) {
            correctStep = true;
        }
        return correctStep;
    } // проверяет можно ли вставить

    //если ввел неверный код просим повторить действие // еще на подумать
    // перемещаем крч
    public static void Peremeshenie(int Xa, int Ya, int Xb, int Yb, int[][] fieldGame) {
        fieldGame[Yb][Xb] = fieldGame[Ya][Xa]; //переставили кольца
        fieldGame[Ya][Xa] = 0;
    }

    public static boolean YouWin(int[][] fieldGame) {
        boolean youWin = false;
        if (fieldGame[fieldGame.length - 1][2] == fieldGame.length - 1) {
            for (int i = fieldGame.length - 2; i > 0; i--) {
                if (fieldGame[i][2] == fieldGame[i + 1][2] - 1) {
                    youWin = true;
                } else {
                    youWin = false;
                }

            }
        }
        return youWin;
    }

    public void StartGame() {
        System.out.println("Вы начали игру в Ханойскую башню/n ");
        System.out.println("Укажите количество колец");
        System.out.println("Минимальное - 3, максимальное - 8");
    }

    public int[][] MiddleGame(int fieldSelection) {
        boolean checkRange = CheckRange(fieldSelection);
        int[][] array = CreateArray(fieldSelection); //создаем поле
        if (checkRange) {
            System.out.println("Ход №1");
            ShowArray(array); //показываекм поле
            ShowOption(); //показываем опции
        }
        return array;
    }

    public boolean EndGame(int step, int[][] fieldGame) {
        boolean exit = Exit(step); // смотрим не решил ли пользователь выйти
        boolean youWin = false;
        int numStep = 1;
        if (!exit) {
            numStep += 1;
            int xa = Xa(step); //находим столбез из какой палки вынимаем кольцо
            int xb = Xb(step); //находим столбез на какую палку вставляем кольцо
            int ya = Ya(xa, fieldGame); //находим строку из какой палки вынимаем кольцо
            int yb = Yb(xb, fieldGame); //находим строку на какую палку вставляем кольцо
            boolean correctStep = CorrectStep(xa, ya, xb, yb, fieldGame); //проверяем возможен ли такой ход
            if (correctStep) {
                Peremeshenie(xa, ya, xb, yb, fieldGame);
            } else {
                System.out.println("Данный ход невозможен!");
                System.out.println("Повторите попытку");

            }
            youWin = YouWin(fieldGame);
            System.out.println("Ход №" + numStep);
            ShowArray(fieldGame); //показываекм поле
            if (!youWin) {
                ShowOption(); //показываем опции
            } else {
                System.out.println("Поздравляем вы прошли игру!");
                System.out.println("Количество шагов: " + numStep);
            }
        } else {
            youWin = true;
            System.out.println("Вы вышли с игры");
        }
        return youWin;
    }


}
