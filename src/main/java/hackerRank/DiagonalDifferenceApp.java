package hackerRank;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DiagonalDifferenceApp {

    static class Pair{
        final int a;
        final int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static int diagonalDifference1(List<List<Integer>> data){
        int len = data.size();
        return Math.abs(IntStream.range(0, len).map(i ->
                data.get(i).get(i) - data.get(i).get(len - 1 - i)
        )
                .sum());
    }

    public static int diagonalDifference(List<List<Integer>> data){
        int len = data.size();
        return IntStream.range(0, len).mapToObj(i -> new Pair(
                data.get(i).get(i),
                data.get(i).get(len - 1 - i)
        ))
                .reduce((p1,p2) -> new Pair(p1.a + p2.a, p1.b + p2.b))
                .map(p -> p.a - p.b)
                .map(Math::abs)
                .orElseThrow(RuntimeException::new);
    }

    public static void main(String[] args) {
        List<List<Integer>> data = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 4, 5),
                Arrays.asList(5, 6, 8)
        );
        int r = diagonalDifference(data);
        System.out.println(r);
    }
}
