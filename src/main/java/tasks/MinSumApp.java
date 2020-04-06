package tasks;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinSumApp {

    static class Pair{
        final int idx;
        final int sum;

        Pair(int idx, int sum) {
            this.idx = idx;
            this.sum = sum;
        }
    }

    public static void main(String[] args) {
        List<Integer> data = new Random().ints(10, 51).limit(30)
                .boxed()
                .collect(Collectors.toList());

        Pair pair = IntStream.range(0, data.size() - 1)
                .mapToObj(idx -> new Pair(data.get(idx), data.get(idx + 1)))
                .min((p1, p2) -> p1.sum - p2.sum)
                .orElseThrow( () -> new RuntimeException("souldn`t be empty"));

        System.out.printf("Data  : %s", data);
        System.out.printf("Index : %d", pair.idx);
        System.out.printf("Num1  : %d", data.get(pair.idx));
        System.out.printf("Num2  : %d", data.get(pair.idx + 1));
        System.out.printf("Sum   : %d", pair.sum);
    }
}
