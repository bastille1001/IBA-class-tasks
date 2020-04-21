package hackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSetsApp {
    static int getTotalX(List<Integer> a, List<Integer> b){
        Collections.sort(a);
        Collections.sort(b);
        int totalX=0;
        int maxA=a.get(a.size()-1);
        int minB=b.get(0);
        int ans=maxA;
        while (ans <= minB){
            int current=ans;
            if (a.stream().allMatch(i->current % i == 0 || i % current == 0)
                    && b.stream().allMatch(i->current % i == 0 || i % current == 0)) totalX++;
            ans += maxA;
        }
        return totalX;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(2,4);
        List<Integer> b = Arrays.asList(16,32,96);
        System.out.println(getTotalX(a,b));
    }
}
