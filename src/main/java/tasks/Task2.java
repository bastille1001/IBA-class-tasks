package tasks;


public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;

        int[] arr = new int[30];
        int[] arr1 = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 40 - 20);
            if (arr[i] % 2 == 0) {
                System.out.print(" " + arr[i]);
                if(arr[i]<20 & arr[i]>-20){
                    sum += arr[i];
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 60 - 30);
            if (arr1[i] % 2 != 0) {
                System.out.print(" " + arr1[i]);
                if(arr1[i]<30 & arr1[i]>-30){
                    sum1 += arr1[i];
                }
            }
        }

        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr1));
        System.out.println("\n");
        System.out.println(sum);
        System.out.println(sum1);
    }
}