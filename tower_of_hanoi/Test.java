package tower_of_hanoi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field field1 = new Field();
        boolean endGame = false;
        field1.StartGame(); //стартует программа и просит ввести колво колец
        int fieldSelection = scanner.nextInt(); //вводит колво колец
        int [][]  fieldGame = field1.MiddleGame(fieldSelection);//проверяет правильно ли ввели колво колец, создает поле, показывает поле
        while (!endGame) {
            int step = scanner.nextInt();
            endGame = field1.EndGame(step, fieldGame); // делает ход, проверяет возможно ли вставить, провереят конец игры
        }

    }
    //премерно так
    //старт игры на чеках завязано
    //цикл через конец игры
}