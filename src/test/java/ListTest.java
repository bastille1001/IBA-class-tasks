import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmupTest.ArraylistWarmUp;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListTest {
    private ArraylistWarmUp task;

    @BeforeEach
    public void initialize() {
        this.task = new ArraylistWarmUp();
    }

    @Test
    void name() {
        List<Integer> a1 = new ArrayList<Integer>();
        List<Integer> a2 = new ArrayList<Integer>();
        List<Integer> a3 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(3);
        a1.add(5);
        a2.add(7);
        a2.add(3);
        a2.add(5);
        a3.addAll(a1);
        a3.addAll(a2);

        ArrayList<Integer> origin1 = (ArrayList<Integer>) a1;
        ArrayList<Integer> origin2 = (ArrayList<Integer>) a2;
        ArrayList<Integer> expected = (ArrayList<Integer>) a3;
        ArrayList<Integer> actual = (ArrayList<Integer>) task.joined(origin1,origin2);
        assertEquals(expected,actual);
    }
}
