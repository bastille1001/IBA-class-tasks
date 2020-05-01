package hackerRank;

import java.util.Arrays;

public class AngryProfessorApp {
    static String angryProfessor(int k, int[] a){
        return Arrays.stream(a, 0, a.length)
                .filter(idx -> idx <= 0)
                .count() >= k ? "YES" : "NO";
    }

    public static void main(String[] args) {
        int[] a = {0,5,6,1,2,4,5};
        System.out.println(angryProfessor(2,a));
    }
}
