package Tower_of_hanoi;

import java.util.Scanner;

public class testTower {
    public static void main(String[] args) {

        methodsOfTower mOT = new methodsOfTower(); //экспорт методов

        int fieldSelection = 4;
        int[][] field = mOT.createArray(fieldSelection); //создали массив и заполнили кольцами
        mOT.showArray(field); //показываем поле
        mOT.showOption();
        int step1 = 1;
        int c = 0;
        int b = 0;
        for (int k = field.length - 1; k > 0; k--) { //находим свободное место там куда хотим перемести кольцо
            if (field[k][b] < field[k - 1][b] && field[k][b] != 0) {
                c = k;
            }

        }
        System.out.println(c);
    }
}