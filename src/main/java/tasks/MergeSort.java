package tasks;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] data1 = new Random().ints(10, 30).limit(20).sorted().toArray();
        int[] data2 = new Random().ints(10, 30).limit(20).sorted().toArray();
        int[] data3 = merge(data1,data2);

        System.out.println(Arrays.toString(data1));
        System.out.println(Arrays.toString(data2));
        System.out.println(Arrays.toString(data3));
    }

    private static int[] merge(int[] data1, int[] data2) {
        int[] data3 = new int[data1.length + data2.length];
        int idx_1 = 0, idx_2 = 0, idx_3 = 0;

        while (idx_1 < data1.length && idx_2 < data2.length){
            if (data1[idx_1] < data2[idx_2]){
                data3[idx_3++] = data1[idx_1++];
            }else {
                data3[idx_3++] = data2[idx_2++];
            }
        }

        while (idx_1 < data1.length){
            data3[idx_3++] = data1[idx_1++];
        }

        while (idx_2 < data2.length){
            data3[idx_3++] = data2[idx_2++];
        }

        return data3;
    }
}
