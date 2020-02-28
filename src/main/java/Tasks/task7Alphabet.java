package Tasks;

public class task7Alphabet {
    public static void main(String[] args) {
        byte[] data = new byte['Z' - 'A' + 1];
        for (byte b = 'A'; b <= 'Z'; b++) {
            data[b - 'A'] = b;
        }
        String alphabet = new String(data);


        /*StringBuilder alphabet = new StringBuilder();
        for (char letter = 'A'; letter <= 'Z' ; letter++) {
            alphabet.append(letter);
        }*/

        System.out.println(alphabet);
    }
}
