package warmupTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArraylistWarmUp {
    public ArrayList<Integer> joined(ArrayList<Integer> a1, ArrayList<Integer> a2){
        ArrayList<Integer> alreadyMixed = new ArrayList<>();
        alreadyMixed.addAll(a1);
        alreadyMixed.addAll(a2);

        Set<Integer> result = null;
        result.addAll(alreadyMixed);
        return (ArrayList<Integer>) result;
    }
}
