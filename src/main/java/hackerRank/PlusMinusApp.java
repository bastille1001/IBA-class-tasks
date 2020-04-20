package hackerRank;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class PlusMinusApp {

    static String format(double num){
        return new DecimalFormat("#0.000000").format(num).replace(',','.');
    }

    static void plusMinus(int[] arr) {
        double len = arr.length;
        double pos = 0.0, neg = 0.0, zero = 0.0;
        for (int value : arr) {
            if (value > 0) pos++;
            if (value < 0) neg++;
            if (value == 0) zero++;
        }
        System.out.println(format(pos/len));
        System.out.println(format(neg/len));
        System.out.println(format(zero/len));
    }

    public static void main(String[] args) {
        int[] arr = {1,5,6,-3,-2,0};
        plusMinus(arr);
    }
}
