package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int LEN = 10;

        int[] ar1 = new int[LEN];
        int[] ar2 = new int[LEN];
        int[] ar3 = new int[LEN];
        int[] tmp = new int[3*LEN];

        for (int i = 0; i < LEN; i++) {
            ar1[i] = ((int)(Math.random()*99)+1)*2;
            for (int j = 0; j < LEN; j++) {
                ar2[i] = ((int)(Math.random()*99)+1)*7;
                for (int l = 0; l < LEN; l++) {
                    ar3[i] = ((int)(Math.random()*99)+1)*11;
                }
            }
        }

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = ar1[i];
            tmp[1+i] = ar2[i];
            tmp[2+i] = ar3[i];
        }

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        System.out.println(Arrays.toString(ar3));
        System.out.println(Arrays.toString(tmp));
    }
}
