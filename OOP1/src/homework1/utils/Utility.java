package homework1.utils;

import java.util.Random;

public class Utility {
    private static final Random random = new Random();

    public static int getRandomInt(int left, int right) {
        return random.nextInt(right - left + 1) + left;
    }
}
