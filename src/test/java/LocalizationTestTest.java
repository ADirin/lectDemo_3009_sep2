import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LocalizationTestTest {

    @Test
    public void testAddMe() {
        assertEquals(5.0, LocalizationTest.addMe(2.0, 3.0));
        assertEquals(0.0, LocalizationTest.addMe(-2.0, 2.0));
        assertEquals(-5.0, LocalizationTest.addMe(-2.0, -3.0));
    }

    @Test
    public void testSubMe() {
        assertEquals(-1.0, LocalizationTest.subMe(2.0, 3.0));
        assertEquals(-4.0, LocalizationTest.subMe(-2.0, 2.0));
        assertEquals(1.0, LocalizationTest.subMe(-2.0, -3.0));
    }
}