package lesson9.task.t1;

import java.util.Arrays;

public class Formatter3 extends Formatter {

    @Override
    public void print(String s) {
        int size = s.length();
        int width = size + 6;
        char[] header = new char[width];
        Arrays.fill(header,'*');
        String headers = new String(header);

        System.out.printf("%s\n* %s *\n%1$s",headers,s.toUpperCase());
    }

}
