import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmupTest.Filter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterTest {
    private Filter task;

    @BeforeEach
    public void initialize() {
        this.task = new Filter();
    }

    @Test
    void filter1() {
        String origin = "Hello";
        String expected = "Hll";
        String actual = task.filter(origin);
        assertEquals(actual, expected);
    }
}
