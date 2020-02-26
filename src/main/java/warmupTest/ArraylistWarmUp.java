package warmupTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArraylistWarmUp {
    public List<Integer> joined(List<Integer> a1, List<Integer> a2){
        List<Integer> a3 = new ArrayList<Integer>();
        a3.addAll(a1);
        a3.addAll(a2);

        return (List<Integer>) a3;
    }
}
