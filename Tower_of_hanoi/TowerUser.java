package Tower_of_hanoi;

import java.util.Scanner;
public class TowerUser {
    public static void main(String[] args) {
        Field test = new Field();
        Scanner scanner = new Scanner(System.in);
        while (!test.ShowYouWin()) {
            test.AllGame(test.ShowStep1());
            if (!test.ShowYouWin()) {
                test.entStep1(scanner.nextInt());
            }
        }
    }

}
