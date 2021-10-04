package tower_of_hanoi;

public class Field {

    int count;
    boolean exit = false;

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count = count + 1;
    }

    public boolean checkRange(int fieldSelection) {
        boolean checkRange = true;
        if (fieldSelection > 8 || fieldSelection < 3) {
            System.out.println("Вы ввели неверное поле");
            System.out.println();
            checkRange = false;
        }
        return checkRange;
    } // ввели количество колец, вернули число колец

    public int[][] createArray(int fieldSelection) {
        int[][] fieldGame = new int[fieldSelection + 1][3]; //создали массив
        for (int i = fieldSelection + 1; i > 0; i--) {  //расставляем кольца
            fieldGame[i - 1][0] = i - 1;
        }
        return fieldGame;
    }

    //создали массив, вернули массив

    public void showArray(int[][] fieldGame) { // показываем игровое поле
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

    public void showOption() { // показываем варианты действий

        System.out.println("1) 1=>2   3)2=>1  5) 3=>1");
        System.out.println("2) 1=>3   4)2=>3  6) 3=>2");
        System.out.println("   7) Закончить игру    ");
        System.out.println();
        System.out.println("Сделайте ход");

    } // показываем варианты действий

    // игрок вводит вариант действия
    public int xa(int step) {
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

    public int xb(int step) {
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

    public void setExit(int step) {
        if (step == 7) {
            this.exit = true;
        }
    } // если пользователь решил выйти

    public boolean isExit() {
        return exit;
    }

    // надо найти необходимые кольца в столбцах
    // для этого нужен сам массив и координаты Xa
    public int ya(int Xa, int[][] fieldGame) {
        int ya = 0;
        for (int i = fieldGame.length - 1; i > 0; i--) {      //находим кольцо которое надо переставить
            if (fieldGame[i][Xa] > fieldGame[i - 1][Xa] && fieldGame[i][Xa] != 0) {
                ya = i;
            }

        }
        return ya;
    } //находит координату кольца по Y в А столбце


    public int yb(int Xb, int[][] fieldGame) {
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
    public boolean correctStep(int Xa, int Ya, int Xb, int Yb, int[][] fieldGame) {
        boolean correctStep = false;
        if ((Yb == fieldGame.length - 1) || fieldGame[Ya][Xa] < fieldGame[Yb + 1][Xb]) {
            correctStep = true;
        }
        return correctStep;
    } // проверяет можно ли вставить

    //если ввел неверный код просим повторить действие // еще на подумать
    // перемещаем крч
    public void peremeshenie(int Xa, int Ya, int Xb, int Yb, int[][] fieldGame) {
        fieldGame[Yb][Xb] = fieldGame[Ya][Xa]; //переставили кольца
        fieldGame[Ya][Xa] = 0;
    }

    public boolean youWin(int[][] fieldGame) {
        boolean youWin = false;
        if (fieldGame[fieldGame.length - 1][2] == fieldGame.length - 1) {
            for (int i = fieldGame.length - 2; i > 0; i--) {
                if (fieldGame[i - 1][2] == fieldGame[i][2] - 1) {
                    youWin = true;
                } else {
                    youWin = false;
                }

            }
        }
        return youWin;
    }

    public void gameMode() {
        System.out.println("Укажите кто будет играть");
        System.out.println("1 - Вы");
        System.out.println("2 - Робот");
    }


    public void startGame() {
        System.out.println("Вы начали игру в Ханойскую башню/n ");
        System.out.println("Укажите количество колец");
        System.out.println("Минимальное - 3, максимальное - 8");
    }


    public boolean moveStep(int step, int[][] fieldGame) {
        int xa = xa(step); //находим столбез из какой палки вынимаем кольцо
        int xb = xb(step); //находим столбез на какую палку вставляем кольцо
        int ya = ya(xa, fieldGame); //находим строку из какой палки вынимаем кольцо
        int yb = yb(xb, fieldGame); //находим строку на какую палку вставляем кольцо
        boolean correctStep = correctStep(xa, ya, xb, yb, fieldGame);
        if (correctStep) {
            peremeshenie(xa, ya, xb, yb, fieldGame);
        }
        return correctStep;
    }


}



