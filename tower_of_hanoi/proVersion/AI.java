package tower_of_hanoi.proVersion;

import java.util.Random;

public class AI extends User{
    Random random = new Random();

    @Override
    public int step(int showOption) {
        return random.nextInt(showOption);
    }
}
