import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        PrintStream output = System.out;
        output.println("Enter the first number: ");

        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        int number1 = scanner.nextInt();

        output.println("Enter the second number: ");

        int number2 = scanner.nextInt();


        output.printf("The result is: %d\n",number1+number2);
    }
}
