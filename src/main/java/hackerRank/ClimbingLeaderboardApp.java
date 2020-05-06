package hackerRank;

import java.util.Arrays;
import java.util.Comparator;

public class ClimbingLeaderboardApp {

    static int calc_score(Integer[] scores, int a){
        //we need to add binary search method here
        //for the time complexity
        int idx = Arrays.binarySearch(scores, a, Comparator.comparingInt(i2 -> i2));
        if (idx < 0) return Math.abs(idx);
        return idx + 1;
    }


    static int[] climbingLeaderboard(int[] scores, int[] alice){
        Integer[] distinct = Arrays.stream(scores).distinct().boxed().toArray(Integer[]::new);
        return Arrays.stream(alice).map(a -> calc_score(distinct, a)).toArray();
    }

    public static void main(String[] args) {
        int[] score = {100,100,50, 40, 40, 20, 10};
        int[] alice = {5, 25, 50, 120};

        System.out.println(Arrays.toString(climbingLeaderboard(score, alice)));
    }
}
