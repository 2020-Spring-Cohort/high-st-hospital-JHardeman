import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JanitorTest {

    @Test
    public void janitorSweeps() {
        Janitor underTest = new Janitor("testJanitor", 1, false, 40000, false);
        underTest.Sweep();
        boolean result = underTest.getIsSweeping();
        assertTrue(result);

    }
}
