package hackerRank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MigratoryBirdsApp {

    static int migratoryBirds1(List<Integer> a){
        Map<Integer, Long> id_count = a.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        long max = id_count.values().stream()
                .max(Comparator.comparingLong(i -> i))
                .orElseThrow(RuntimeException::new);

        return id_count.entrySet().stream()
                .filter(e -> e.getValue() == max)
                .map(Map.Entry::getKey)
                .min(Comparator.comparingInt(x -> x))
                .orElseThrow(RuntimeException::new);
    }

    static int migratoryBirds(List<Integer> a) {
        int max=0;
        int[] countArray=new int[3 << 1];
        for (int val : a){
            countArray[val]++;
            max=Math.max(max,countArray[val]);
        }
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] == max){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);

        System.out.println(migratoryBirds(data));
        System.out.println(migratoryBirds1(data));
    }
}
