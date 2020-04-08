package tasks;

public class StringOp {
    public static String shift(String orig, int toLeft, int toRight){
        int len = orig.length();
        int delta = (toRight - toLeft) % len;
        if (delta == 0) return orig;
        int middle = delta > 0 ? len - delta : -delta;
        return orig.substring(middle).concat(orig.substring(0,middle));

    }

    public static void main(String[] args) {
        String original = "developer";
        System.out.println(shift(original,4,1));
    }
}
