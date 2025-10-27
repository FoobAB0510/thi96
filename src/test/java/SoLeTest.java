// (b + 1) / 2 - a / 2; L
// b/2 - (a-1)/2; C
// 500L * (999 + 1) / 2

import com.foob.SoLe;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SoLeTest {

    private SoLe cltest;

    @BeforeEach
    void setUp() {
        cltest = new SoLe();
    }

    @Test
    void sum_default() {
        assertEquals(250000, cltest.sumOdd());
    }

    @Test
    void sum_checkBien() {
        assertEquals(500L * (999 + 1) / 2, cltest.sumOdd());
    }

    @Test
    void sum_notZero() {
        assertTrue(cltest.sumOdd() != 0);
    }

    @Test
    void sum_stable() {
        assertEquals(cltest.sumOdd(), cltest.sumOdd());
    }

    @Test
    void sum_longLimit() {
        assertTrue(cltest.sumOdd() < Integer.MAX_VALUE);
    }
}