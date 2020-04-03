package Tasks;

import java.util.Arrays;
import java.util.Random;


public class Task11 {
    public static void main(String[] args) {
        int[] data = new Random().ints(10, 51)
                .limit(30).toArray();

        int minSum = data[0] + data[1];
        int minIndex = 0;

        for (int i = 0; i < data.length - 1; i++) {
            int sum = data[i] + data[i + 1];
            if (minSum > sum) {
                minSum = sum;
                minIndex = i;
            }
        }
        System.out.println(Arrays.toString(data));
        System.out.printf("Minimum sum of pairs: %d,\n minimum index of pairs: %d", minSum, minIndex);
    }
}
