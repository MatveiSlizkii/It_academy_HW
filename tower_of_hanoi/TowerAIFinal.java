package tower_of_hanoi;

import java.util.Random;

public class TowerAIFinal {
    public void gameUser(int fieldSelection) {
        Field test = new Field();
        Random random = new Random();
        boolean youWin = false;
        int[][] fieldGame = test.createArray(fieldSelection);
        while (!youWin) {
            test.setCount();
            test.moveStep(random.nextInt(7) + 1, fieldGame);
            youWin = test.youWin(fieldGame);
            if (youWin) {
                test.showArray(fieldGame); //показываекм поле
                System.out.println("Робот закончил игру!");
                System.out.println("За " + test.getCount() + " ходов!");
            }
        }
    }

}
