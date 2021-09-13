package Tower_of_hanoi;


public class methodsOfTower {

    public static int[][] createArray(int fieldSelection) {
        int[][] fieldGame = new int[fieldSelection + 1][3]; //создали массив
        for (int i = fieldSelection + 1; i > 0; i--) {  //расставляем кольца
            fieldGame[i - 1][0] = i - 1;
        }
        return fieldGame;
    }

    public static void showArray(int[][] fieldGame) { // показываем игровое поле
        for (int i = 0; i < fieldGame.length; i++) {                       //идём по строкам
            for (int j = 0; j < 3; j++) {                               //идём по столбцам
                System.out.print("    " + fieldGame[i][j] + "    ");  //вывод элемента
            }
            System.out.println();                               //перенос строки ради визуального сохранения табличной формы
        }
    }

    public static void showOption() { // показываем варианты действий

        System.out.println("1) 1=>2   3)2=>1  5) 3=>1");
        System.out.println("2) 1=>3   4)2=>3  6) 3=>2");
        System.out.println("   7) Закончить игру    ");
    }

    public static void step(int num, int[][] fieldGame) { // действие
        int a = 0;
        int b = 0;
        int num1 = num;
        int[][] fieldGame1 = fieldGame;
        if (num == 1) {
            a = 0;
            b = 1;
        } else if (num == 2) {
            a = 0;
            b = 2;
        } else if (num == 3) {
            a = 1;
            b = 0;
        } else if (num == 4) {
            a = 1;
            b = 2;
        } else if (num == 5) {
            a = 2;
            b = 0;
        } else if (num == 6) {
            a = 2;
            b = 1;
        } else if (num == 7) {
            System.out.println("Игра окончена"); // перебить на булевое значение
        }


        int a1 = 0;
        for (int i = fieldGame.length - 1; i > 0; i--) {      //находим кольцо которое надо переставить
            //fieldGame[i][a]
            if (fieldGame[i][a] > fieldGame[i - 1][a] && fieldGame[i][a] != 0) {
                a1 = i;
            }

        }
        int b1 = fieldGame.length - 1;
        System.out.println("длина столбца" + b1);
        for (int i = fieldGame.length - 1; i > 0; i--) { //находим свободное место там куда хотим перемести кольцо
            if (fieldGame[i][b] > fieldGame[i - 1][b] && fieldGame[i][b] != 0) {
                b1 = i;
                System.out.println("ббббб1 " + b1);
            }
        }
        System.out.println("ааааааа " + a1);
        //     System.out.println(a1);
//        System.out.println(b1);
        //проверка можно ли вставить
        if (b1 == fieldGame.length - 1) {

            //      System.out.println(a1);
            fieldGame[b1][b] = fieldGame[a1][a]; //переставили кольца
            fieldGame[a1][a] = 0;
        } else if (fieldGame[a1][a] > fieldGame[b1 + 1][b]) {
            System.out.println("сюда не может встать это кольцо");
            step(num1, fieldGame1);

        } else {
            fieldGame[b1][b] = fieldGame[a1][a1]; //переставили кольца
            fieldGame[a1][a] = 0;
        }
    }

}








