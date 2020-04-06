package tasks;

public class Task6 {
    public static void main(String[] args) {
        int range = 'Z'-'A' + 1;
        int start = 'A';
        StringBuilder rand_s = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            int zeroOrOne = (int)(Math.random()*2);
            char letter = (char) (Math.random() * range + start + 32 * zeroOrOne);
            rand_s.append(letter);
        }

        String random = rand_s.toString();
        StringBuilder vowels_c = new StringBuilder();
        StringBuilder vowels_s = new StringBuilder();
        StringBuilder consonants_c = new StringBuilder();
        StringBuilder consonants_s = new StringBuilder();

        for (int i = 0; i < random.length(); i++) {
            char c = random.charAt(i);
            if (isCapital(c)){
                if (isVowel(c))vowels_c.append(c);
                else consonants_c.append(c);
            }else {
                if(isVowel(c)) vowels_s.append(c);
                else consonants_s.append(c);
            }
        }


        System.out.println(random);
        System.out.println(vowels_c.toString());
        System.out.println(consonants_c.toString());

    }
    static boolean isCapital(char c){
        return c <='Z';
    }

    static boolean isVowel(char c){
        final String VOWCAP = "AEOIU";
        final String vow = VOWCAP.toLowerCase();
        VOWCAP.contains(String.valueOf(c & 0x40));
        return VOWCAP.contains(String.valueOf(c)) ||
                vow.contains(String.valueOf(c));
    }
}
