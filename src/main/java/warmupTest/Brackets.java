package warmupTest;

public class Brackets {
    public int calc(String origin) {
        int numOfBracket = 0;
        int max = 0;
        for (int i = 0; i < origin.length(); i++) {
            switch (origin.charAt(i)){
                case '(': numOfBracket++; break;
                case ')': numOfBracket--; break;
            }
            max = Math.max(numOfBracket,max);
        }
        return max;
    }
}
