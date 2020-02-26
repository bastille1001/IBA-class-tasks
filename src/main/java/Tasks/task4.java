package Tasks;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        final int LEN = 30;
        int[] array = new int[LEN];
        int[] arrayPos = new int[LEN];
        int[] arrayNeg = new int[LEN];

        int ni = 0;
        int pi = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100-50);
        }


        for (int el : array) {
            if (el > 0){
                arrayPos[pi++] = el;
            }
        }

        for (int el : array) {
            if (el < 0){
                arrayNeg[ni++] = el;
            }
        }

        int[] neg = Arrays.copyOf(arrayNeg,ni);
        int[] pos = Arrays.copyOf(arrayPos, pi);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));
    }
}

