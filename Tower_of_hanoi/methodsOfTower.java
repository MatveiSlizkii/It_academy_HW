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

    public static boolean step(int num, int[][] fieldGame, int gameMode) { // действие
        boolean gameOver = true;
        int a = 0;
        int b = 0;

        switch (num) {
            case 1:
                a = 0;
                b = 1;
                break;
            case 2:
                a = 0;
                b = 2;
                break;
            case 3:
                a = 1;
                b = 0;
                break;
            case 4:
                a = 1;
                b = 2;
                break;
            case 5:
                a = 2;
                b = 0;
                break;
            case 6:
                a = 2;
                b = 1;
                break;
            case 7:
                System.out.println("Игра окончена"); // перебить на булевое значение
                gameOver = false;
                break;
        }


        int a1 = 0;
        for (int i = fieldGame.length - 1; i > 0; i--) {      //находим кольцо которое надо переставить
            if (fieldGame[i][a] > fieldGame[i - 1][a] && fieldGame[i][a] != 0) {
                a1 = i;
            }

        }
        int b1 = 0;
        for (int i = fieldGame.length - 1; i > 0; i--) { //находим свободное место там куда хотим перемести кольцо
            if (fieldGame[i][b] == 0) {
                b1 = i;
                i = 0;
            }
        }

        if (gameOver) {
            if (b1 == fieldGame.length - 1) { // Проверка пашет на расстановку!!!!!

                fieldGame[b1][b] = fieldGame[a1][a]; //переставили кольца
                fieldGame[a1][a] = 0;
            } else if
            (fieldGame[a1][a] < fieldGame[b1 + 1][b]) {
                fieldGame[b1][b] = fieldGame[a1][a]; //переставили кольца
                fieldGame[a1][a] = 0;
            } else {
                if (gameMode !=2) {
                    System.out.println("Вставить не представляется возможным");
                }
            }
        }

        return gameOver;
    }


    public static boolean winner(int num, int numStep, int[][] arr) { // действие
        boolean win = false;
        int stick = 0;
        int numWin = num * (num - 1);
//        System.out.println("ход" + numStep);
        if (numStep >= numWin) {
//            System.out.println("пошла родимая");
//            System.out.println(arr[0].length);
//            System.out.println(arr.length);

            for (int i = 0; i < 3; i++) {
                if (arr[arr.length - 1][i] == num) {
                    stick = i;
//                    System.out.println("определили что основа лежит в " + stick);
                }
            }
            for (int i = arr.length - 2; i > -1; i--) {
                if (arr[i][stick] == arr[i + 1][stick] - 1) {
                    win = true;
//                    System.out.println("ТРУУУУУУУ");
                } else {
                    win = false;
                }
            }
        }
        return win;
    }
}



