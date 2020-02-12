import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the width: ");
        int width = in.nextInt();

        System.out.print("Enter the height: ");
        int height = in.nextInt();

        double k = ((double) width) / height;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (x == 0 || x==width-1 || y==0 || y==height-1 || x==y*k || width-x-1==y*k) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}