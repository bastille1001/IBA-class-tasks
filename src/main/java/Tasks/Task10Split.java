package Tasks;

import SentenceTasks.SentenceTask10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10Split {
    public static void main(String[] args) {
        List<String> subjects = Arrays.asList("Noel", "The cat", "The dog");
        List<String> verbs =    Arrays.asList("wrote", "chased", "slept on");
        List<String> objects =  Arrays.asList("the book","the ball","the bed");

        List<SentenceTask10> sentences = new ArrayList<>();
        for (String subj: subjects) {
            for (String verb: verbs) {
                for (String object: objects) {
                    sentences.add(new SentenceTask10(subj,verb,object));
                }
            }
        }

        for (SentenceTask10 s: sentences) {
            System.out.println(s.represent());
        }

    }
}
