package sentenceTasks;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Task11Sentences {

    private static List<String> read(String filename) throws FileNotFoundException {
        File ifile= new File(filename);
        FileReader fr= new FileReader(ifile);
        BufferedReader br= new BufferedReader(fr);
        return br.lines().collect(Collectors.toList());
    }

    private static void write(List<String> lines, String filename) throws IOException {
        File file = new File(filename);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (String line: lines) {
            bw.write(line);
            bw.write("\n");
        }
        bw.close();
    }

    private static List<String > process(Map<String, List<String>> convert1, Map<String, List<String>> convert2) {
        List<String> sentences= new ArrayList<>();
        String sentence=null;
        for (String s:convert1.keySet())
            for (String v: convert1.get(s))
                for (String o:convert2.get(v)){
                    sentence = String.format("%s %s %s ",s,v,o);
                    sentences.add(sentence);
                }
        return sentences;
    }

    private static Map<String, List<String>> convertLS(List<String> data) {
        Map<String, List<String>> map = new HashMap<>();
        Iterator<String> it = data.iterator();
        while (it.hasNext()){
            String el = it.next();
            String[] splitted = el.split("[:,]");
            List<String> val = new ArrayList<>();
            for(int i=1;i<splitted.length;i++)
                val.add(splitted[i]);
            map.put(splitted[0],val);}
        return map;
    }


    public static void main(String[] args) throws IOException {
        List<String> verb_obj = read("subj_verb_.txt");
        List<String> subj_obj = read("verb_obj_.txt");
        Map<String, List<String>> convert1 = convertLS(verb_obj);
        Map<String, List<String>> convert2 = convertLS(subj_obj);
        List<String> sentence = process(convert1,convert2);
        write(sentence,"file6.txt");
    }
}
