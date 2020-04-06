package tasks;


import java.util.Scanner;

public class HackerRankApp {
    public static void main(String[] args) {
        int a, n, p;
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            a = scanner.nextInt();
            n = scanner.nextInt();
            p = scanner.nextInt();
            int result = (int) Math.pow(a,faktorial(n)) % p;
            System.out.printf("Case #%d: %d", i, result);
        }
    }

    static int faktorial(int number){
        if (number == 0 || number == 1) return 1;
        return number * faktorial(number - 1);
    }
}
