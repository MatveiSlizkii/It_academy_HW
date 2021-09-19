package Tower_of_hanoi;

import java.util.Random;
import java.util.Scanner;
public class testTower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field test = new Field();
        int[][] fieldGame = {{0,0,0},{0,0,1},{0,0,2},{0,0,3}};
        test.ShowArray(fieldGame);
        boolean youWin = false;
        if (fieldGame[fieldGame.length-1][2] == fieldGame.length-1){
            System.out.println("Poshla");
            for (int i = fieldGame.length-2; i > 0; i--) {
                if (fieldGame[i][2] < fieldGame[i+1][2]){
                    youWin = true;
                }else {
                    youWin = false;
                }
            }
        }
        System.out.println(youWin);
        }

}
