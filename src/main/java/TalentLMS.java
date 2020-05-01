import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TalentLMS {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,7,2,6,9);
        System.out.println(findSquareOfMaxOdd(numbers));
    }

    private static int findSquareOfMaxOdd(List<Integer> num){
        return num.stream()
                .filter(TalentLMS::isOdd)
                .filter(TalentLMS::isGreaterThan3)
                .filter(TalentLMS::isLessThan11)
                .max(Comparator.naturalOrder())
                .map(i -> i*i)
                .get();
    }

    private static boolean isOdd(int i){
        return i % 2 != 0;
    }

    private static boolean isGreaterThan3(int i){
        return i > 3;
    }

    private static boolean isLessThan11(int i){
        return i < 11;
    }
}
