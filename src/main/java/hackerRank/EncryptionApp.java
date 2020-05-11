package hackerRank;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EncryptionApp {
    public static String encryption(final String s0) {
        final String s = s0.replaceAll(" ", "");
        int len = s.length();
        double l = Math.sqrt(len);
        int l1 = (int) Math.floor(l);
        int l2 = (int) Math.ceil(l);
        int cols = l2;
        int rows = l1 == l2 ? l1 : l1 * l2 < len ? l2 : l1;

        return IntStream.range(0, cols).boxed().flatMap(c ->
                IntStream.range(0, rows).boxed().map(r -> {
                    //calculate index
                    int idx = r * cols + c;
                    //extract char
                    String ch = idx < len ? String.valueOf(s.charAt(idx)) : "";
                    //extra space
                    return r == rows - 1 ? ch + " " : ch;
                })).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String origin = "haveaniceday";
        System.out.println(encryption(origin));
    }
}
