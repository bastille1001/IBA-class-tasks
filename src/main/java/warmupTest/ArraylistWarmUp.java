package warmupTest;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class ArraylistWarmUp {
    public List<Integer> joined(List<Integer> l1, List<Integer> l2){
        HashSet<Integer> set = new HashSet<>();
        set.addAll(l1);
        set.addAll(l2);
        return new ArrayList<>(set);
    }
}
