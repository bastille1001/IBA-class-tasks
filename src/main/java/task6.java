
public class task6 {
    public static void main(String[] args) {
        int range = 'Z' - 'A' + 1;
        String str = "";
        final int LEN = 30;
        for (int i = 0; i < LEN; i++) {
            boolean way = (int)((Math.random()*range))%2==0;
            char c = (char)(Math.random()*range + (way ? 'A':'a'));
            str += c;
        }
        System.out.println(str);
        int charCount = 0;
        String vowels = "aeiou";
        int counVow = 0;
        for (char charBox : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(charBox)){
                charCount++;
                if (vowels.indexOf(charBox) != -1) {
                    counVow++;
                }
            }
        }
        System.out.printf("Гласных = %d;%nСогласных = %d", counVow, charCount - counVow);
    }

}
