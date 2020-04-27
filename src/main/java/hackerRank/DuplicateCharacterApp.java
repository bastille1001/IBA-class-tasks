package hackerRank;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacterApp {

    private static Map<Character, Long> duplicate(String s){
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    public static void main(String[] args) {
        String orig = "hhkloakss";
        System.out.println(duplicate(orig));
    }
}
