package tower_of_hanoi.proVersion;

public class Field {

    private int count;
    private boolean exit = false;
    private int[][] fieldGame;

    public Field(int fieldSelection) {
        checkRange(fieldSelection);
        this.fieldGame = this.createArray(fieldSelection);
    }

    public int getCount() {
        return count;
    }

    private void incCount() {
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

    public void showArray() { // показываем игровое поле
        for (int i = 0; i < this.fieldGame.length; i++) {                       //идём по строкам
            for (int j = 0; j < 3; j++) {                               //идём по столбцам
                if (this.fieldGame[i][j] == 0) {
                    System.out.print("    " + "|" + "    ");
                } else {
                    System.out.print("    " + this.fieldGame[i][j] + "    ");  //вывод элемента
                }
            }
            System.out.println();                               //перенос строки ради визуального сохранения табличной формы
        }

    } //показываем поле

    public int showMaxOption() { // показываем варианты действий
        return 7;
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
    public int ya(int Xa) {
        int ya = 0;
        for (int i = this.fieldGame.length - 1; i > 0; i--) {      //находим кольцо которое надо переставить
            if (this.fieldGame[i][Xa] > this.fieldGame[i - 1][Xa] && this.fieldGame[i][Xa] != 0) {
                ya = i;
            }

        }
        return ya;
    } //находит координату кольца по Y в А столбце


    public int yb(int Xb) {
        int yb = 0;
        for (int i = this.fieldGame.length - 1; i > 0; i--) { //находим свободное место там куда хотим перемести кольцо
            if (this.fieldGame[i][Xb] == 0) {
                yb = i;
                i = 0;
            }
        }
        return yb;
    } //находит координату кольца по Y в B столбце

    // далее делаем проверку можно ли передвинуть кольцо
    // нужно ввести воординаты и само поле
    public boolean correctStep(int Xa, int Ya, int Xb, int Yb) {
        boolean correctStep = false;
        if ((Yb == this.fieldGame.length - 1) || this.fieldGame[Ya][Xa] < this.fieldGame[Yb + 1][Xb]) {
            correctStep = true;
        }
        return correctStep;
    } // проверяет можно ли вставить

    //если ввел неверный код просим повторить действие // еще на подумать
    // перемещаем крч
    public void peremeshenie(int Xa, int Ya, int Xb, int Yb) {
        this.fieldGame[Yb][Xb] = this.fieldGame[Ya][Xa]; //переставили кольца
        this.fieldGame[Ya][Xa] = 0;
    }

    public boolean youWin() {
        boolean youWin = false;
        if (this.fieldGame[this.fieldGame.length - 1][2] == this.fieldGame.length - 1) {
            for (int i = this.fieldGame.length - 2; i > 0; i--) {
                if (this.fieldGame[i - 1][2] == this.fieldGame[i][2] - 1) {
                    youWin = true;
                } else {
                    youWin = false;
                }

            }
        }
        return youWin;
    }

    public boolean moveStep(int step) {
        incCount();
        int xa = xa(step); //находим столбез из какой палки вынимаем кольцо
        int xb = xb(step); //находим столбез на какую палку вставляем кольцо
        int ya = ya(xa); //находим строку из какой палки вынимаем кольцо
        int yb = yb(xb); //находим строку на какую палку вставляем кольцо
        boolean correctStep = correctStep(xa, ya, xb, yb);
        if (correctStep) {
            peremeshenie(xa, ya, xb, yb);
        }
        return correctStep;
    }


}


