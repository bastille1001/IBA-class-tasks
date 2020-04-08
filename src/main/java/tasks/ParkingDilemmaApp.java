package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParkingDilemmaApp {
    public static long carParkingRoof(List<Long> cars, int k) {
        /*Collections.sort(cars);
        long minDist = Long.MAX_VALUE;
        for (int i = 0; i <= cars.size() - k; i++) {
            minDist = Math.min(minDist, cars.get(i + k - 1) - cars.get(i));
        }
        return minDist + 1; */

        //we sorted our data
        List<Long> sorted = cars.stream().sorted().collect(Collectors.toList());

        return IntStream.rangeClosed(0, sorted.size() - k + 1)
                .mapToLong(idx -> sorted.get(idx + k -1) - sorted.get(idx))
                .min()
                .orElseThrow(RuntimeException::new);
    }

    public static void main(String[] args) {
        List<Long> cars = Arrays.asList(6L, 2L, 12L, 7L);
        long r = carParkingRoof(cars, 3);
        System.out.println(r); // 6
    }
}
