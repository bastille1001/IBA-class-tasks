package Tasks;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Task11Sentences {

    private static HashMap<String,List<String>> read(String filename) throws IOException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        List<String> ls = br.lines().collect(Collectors.toList());
        HashMap<String, List<String>> hm = new HashMap<>();

        for (String line: ls) {
            String[] ss = line.split(":");
            String key = ss[0].trim();
            String[] valueArr = ss[1].trim().split(", ");

            List<String> value = Arrays.asList(valueArr);
            hm.put(key,value);
        }
        br.close();
        return hm;
    }


    public static void main(String[] args) throws IOException {
        HashMap<String,List<String>> sv = read("subj_verb_.txt");
        HashMap<String,List<String>> vo = read("verb_obj_.txt");

        for (String s: sv.keySet()) {
            for (String v: sv.get(s)) {
                for (String o: vo.get(v)) {
                    System.out.println(new Sentence(s,v,o));
                }
            }

        }
    }
}
