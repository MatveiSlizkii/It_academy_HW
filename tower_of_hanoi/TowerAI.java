package tower_of_hanoi;

import java.util.Random;

public class TowerAI {
    public static void main(String[] args) {
        Field test = new Field();
        Random random = new Random();
        while (!test.ShowYouWin()) {
            test.AllGame(test.ShowStep1());
            if (!test.ShowYouWin()) {
                test.entStep1(random.nextInt(6));
            }
        }
    }

}
