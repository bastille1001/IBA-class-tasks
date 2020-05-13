package hackerRank;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LadyBagsApp {
    private final static String YES = "YES";
    private final static String NO = "NO";

    static boolean alreadyGrouped(String bag){
        String sq = squeezeDuplicate(bag);
        return sq.length() == sq.chars().distinct().count();
    }

    static String squeezeDuplicate(String bag){
        return IntStream.range(0, bag.length()).boxed().flatMap(idx -> {
            char curr = bag.charAt(idx);
            char prev = idx == 0 ? '_' : bag.charAt(idx - 1);
            return curr == prev ? Stream.empty() : Stream.of(String.valueOf(curr));
        })
                .collect(Collectors.joining());
    }

    static boolean hasSingleBug(String bag) {
        return bag.chars()
                .boxed()
                .filter(c -> c != '_')
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .containsValue(1L);
    }

    static String happyLadybugs(String b) {
        if (hasSingleBug(b)) return NO;
        if (b.contains("_")) return YES;
        if (alreadyGrouped(b)) return NO;
        return NO;
    }
}
