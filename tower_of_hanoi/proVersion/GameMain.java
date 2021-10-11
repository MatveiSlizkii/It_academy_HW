package tower_of_hanoi.proVersion;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field field = new Field(scanner.nextInt());//ввод колво колечек
        System.out.println("Вы начали игру в Ханойскую башню/n ");
        System.out.println("Укажите количество колец");
        System.out.println("Минимальное - 3, максимальное - 8");

        System.out.println("Укажите кто будет играть");
        System.out.println("1 - Вы");
        System.out.println("2 - Робот");

        IUser user;
        switch (scanner.nextInt()){ //ввод кто играет и дальше запускает что надо
            case 1:
                user = new Human();
                break;
            case 2:
                user = new AI();
                break;
            default:
                user = null;
        }

        user.gameUser(field);
    }

}