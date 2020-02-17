
public class task6 {
    public static void main(String[] args) {
        final String VOWCAP = "AEOIU";
        int range = 'Z'-'A' + 1;
        StringBuilder rand_s = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            boolean way =(int)(Math.random()*range)%2==0;
            char letter = (char) (Math.random() * range + (way? 'A' : 'a'));
            rand_s.append(letter);
        }
        String random = rand_s.toString();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        for (int i = 0; i < random.length(); i++) {
            char c = random.charAt(i);
            if(VOWCAP.contains(String.valueOf(c)))
                vowels.append(c);
            else
                consonants.append(c);
        }

        System.out.println(random);
        System.out.println(vowels.toString());
        System.out.println(consonants.toString());
        System.out.println(vowels.toString().toLowerCase());
        System.out.println(consonants.toString().toLowerCase());
    }
}
