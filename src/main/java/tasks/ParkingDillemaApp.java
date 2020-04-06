package tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParkingDillemaApp {
    public static long carParkingRoof(List<Long> cars, int k) {
        if (cars.size() == 0 || k < 0) return 0;
        Collections.sort(cars);
        long minDist = Long.MAX_VALUE;
        for (int i = 0; i <= cars.size() - k; i++) {
            minDist = Math.min(minDist, cars.get(i + k - 1) - cars.get(i));
        }
        return minDist + 1;
    }

    public static void main(String[] args) {
        List<Long> cars = Arrays.asList(6L, 2L, 12L, 7L);
        long r = carParkingRoof(cars, 3);
        System.out.println(r); // 6
    }
}
