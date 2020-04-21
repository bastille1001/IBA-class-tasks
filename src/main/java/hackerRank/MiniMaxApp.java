package hackerRank;

import java.util.Arrays;

public class MiniMaxApp {
    static void minimax(int[] a){
        long ans_min = 0;
        long ans_max = 0;
        Arrays.sort(a);

        for (int i = 0; i < a.length - 1; i++) {
                ans_min += a[i];
        }
        for (int i = 1; i < a.length; i++) {
            ans_max += a[i];
        }

        System.out.printf("%d %d", ans_min, ans_max);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        minimax(a);
    }
}
