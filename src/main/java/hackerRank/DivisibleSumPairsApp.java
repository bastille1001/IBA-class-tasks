package hackerRank;

public class DivisibleSumPairsApp {
    static int divisibleSumPairs(int n, int k, int[] a){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                int value = a[i] + a[j];
                if (value % k == 0 && j>i) count +=1;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] data = {1,3,2,6,1,2};

        System.out.println(divisibleSumPairs(6,3,data));
    }
}
