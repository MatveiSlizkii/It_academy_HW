package tower_of_hanoi.proVersion;

import java.util.Scanner;

public class Human extends User {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public int step(int showOption) {
        System.out.println("1) 1=>2   3)2=>1  5) 3=>1");
        System.out.println("2) 1=>3   4)2=>3  6) 3=>2");
        System.out.println("   7) Закончить игру    ");
        System.out.println();
        System.out.println("Сделайте ход");

        System.out.println("Ход № " + this.f.getCount());
        return scanner.nextInt();
    }
}
