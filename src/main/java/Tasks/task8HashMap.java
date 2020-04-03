package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class task8HashMap {
    public static void main(String[] args) {
        String str = "Hello World";
        int len = str.length();
        HashMap<Character, ArrayList<Integer>> numChars = new HashMap<>();

        for (int i = 0; i < len; i++)
        {
            char charAt = str.charAt(i);
            if (!numChars.containsKey(charAt)){
                numChars.put(charAt,new ArrayList<>(Collections.singletonList(i)));
            }else{
                numChars.get(charAt).add(i);
            }
        }

        System.out.println(numChars);
    }
}
