package tower_of_hanoi;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field field = new Field();
        field.startGame();
        int fieldSelection = scanner.nextInt();
        boolean checkRange = field.checkRange(fieldSelection);
        if (checkRange) {
            field.gameMode();
            switch (scanner.nextInt()){
                case 1:
                    TowerUserFinal towerUserFinal = new TowerUserFinal();
                    towerUserFinal.gameUser(fieldSelection);
                    break;
                case 2:
                    TowerAIFinal towerAIFinal = new TowerAIFinal();
                    towerAIFinal.gameUser(fieldSelection);
                    break;
            }

        }

    }

}
