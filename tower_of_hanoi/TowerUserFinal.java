package tower_of_hanoi;

import java.util.Scanner;

public class TowerUserFinal {
    public void gameUser(int fieldSelection) {
        Field test = new Field();
        Scanner scanner = new Scanner(System.in);
        boolean youWin = false;
        int[][] fieldGame = test.createArray(fieldSelection);
        while (!youWin && !test.isExit()) {
            test.setCount();
            System.out.println("Ход № " + test.getCount());
            test.showArray(fieldGame); //показываекм поле
            test.showOption(); //показываем опции
            int step = scanner.nextInt();
            test.setExit(step);
            if (!test.isExit()) {
                boolean correctStep = test.moveStep(step, fieldGame);
                if (!correctStep) {
                    System.out.println("Данный ход невозможен!");
                    System.out.println("Повторите попытку");
                }
                youWin = test.youWin(fieldGame);
                if (youWin) {
                    test.showArray(fieldGame); //показываекм поле
                    System.out.println("Поздравляем вы прошли игру!");
                    System.out.println("За " + test.getCount() + " ходов!");
                }
            }
        }
        if (test.isExit()){
            System.out.println("Вы вышли из игры");
        }
    }

}
