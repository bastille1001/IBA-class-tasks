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
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(3);
        a1.add(5);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(7);
        a2.add(3);
        a2.add(5);

        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(1);
        a3.add(3);
        a3.add(5);
        a3.add(7);

        ArrayList<Integer> origin1 = a1;
        ArrayList<Integer> origin2 = a2;
        ArrayList<Integer> expected = a3;
        ArrayList<Integer> actual = task.joined(a1,a2);
        assertEquals(expected,actual);
    }
}
