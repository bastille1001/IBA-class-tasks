package SentenceTasks;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class Sentences4App {
  public static void main(String[] args) throws IOException {
    List<String> f1 = read("subj_verb_.txt");
    List<String> f2 = read("verb_obj_.txt");
    Map<String, List<String>> sv = convert(f1);
    Map<String, List<String>> vo = convert(f2);
    List<Sentence> sentences = combine(sv, vo);
    write("combined.txt", sentences);
  }

  private static List<Sentence> combine(Map<String, List<String>> sv, Map<String, List<String>> vo) {
    return sv.keySet().stream().flatMap(subj ->
        sv.get(subj).stream().flatMap(verb ->
            vo.get(verb).stream().map(obj ->
                new Sentence(subj, verb, obj)
            )
        )
    ).collect(Collectors.toList());
  }

  private static Map<String, List<String>> convert(List<String> list) {
    HashMap<String, List<String>> data = new HashMap<>();
    for (String line: list) {
      String[] splitted = line.split(":");
      String[] splited2 = splitted[1].split(",");
      data.put(
          splitted[0].trim(),
          Arrays.stream(splited2).map(String::trim).collect(Collectors.toList())
      );
    }
    return data;
  }

  private static void write(String filename, List<Sentence> sentences) {

    try {
      BufferedWriter bw;
      File file = new File(filename);
      bw = new BufferedWriter(new FileWriter(file));

      sentences.forEach(new Consumer<Sentence>() {
        @Override
        public void accept(Sentence sentence) {
          try {
            bw.write(sentence.represent());
            bw.write("\n");
          } catch (IOException es){
            throw new RuntimeException("IOExcepton", es);
          }
        }
      });

      bw.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static List<String> read(String filename) throws FileNotFoundException {
    File file = new File(filename);
    return new BufferedReader(new FileReader(file)).lines().collect(Collectors.toList());
  }
}
