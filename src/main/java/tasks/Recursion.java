package tasks;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(faktorial(5));
        System.out.println(fibonacci(32));
    }

    private static int faktorial(int num) {
        if (num == 0 || num == 1) return 1;
        int fakt = faktorial(num - 1);
        return num * fakt;
    }

    private static int fibonacci(int num){
        if (num == 1 || num == 2) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
