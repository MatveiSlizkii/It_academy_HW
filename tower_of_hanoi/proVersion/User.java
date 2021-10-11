package tower_of_hanoi.proVersion;

import java.util.Scanner;

public abstract class User implements IUser {

    protected Field f;

    public final void gameUser(Field test) {
        this.f = test;
        boolean youWin = false;
        while (!youWin && !test.isExit()) {
            System.out.println("Ход № " + test.getCount());
            test.showArray(); //показываекм поле
            int step = step(test.showMaxOption());
            test.setExit(step);
            if (!test.isExit()) {
                boolean correctStep = test.moveStep(step);
                if (!correctStep) {
                    System.out.println("Данный ход невозможен!");
                    System.out.println("Повторите попытку");
                }
                youWin = test.youWin();
                if (youWin) {
                    test.showArray(); //показываекм поле
                    System.out.println("Поздравляем вы прошли игру!");
                    System.out.println("За " + test.getCount() + " ходов!");
                }
            }
        }
        if (test.isExit()){
            System.out.println("Вы вышли из игры");
        }
    }

    public abstract int step(int showOption);
}
