package kata;

import java.util.Arrays;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return Arrays.stream(classPoints).average().getAsDouble() < yourPoints;
    }
}

/*BEST SOLUTION

import java.util.Arrays;

class Kata {
    static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}

*/