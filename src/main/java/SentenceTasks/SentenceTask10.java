package SentenceTasks;

public class SentenceTask10 {
    public final String subj;
    public final String verb;
    public final String obj;

    public SentenceTask10(String subj, String verb, String obj) {
        this.subj = subj;
        this.verb = verb;
        this.obj = obj;
    }

    public String represent(){
        return String.format("%s %s %s", subj,verb,obj);
    }

    @Override
    public String toString() {
        return String.format("Sentence[%s]", represent());
    }
}
