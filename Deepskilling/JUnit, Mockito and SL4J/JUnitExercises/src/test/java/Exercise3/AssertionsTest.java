package Exercise3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class AssertionsTest {

    @Test
    public void testAssertions() {

        // Checks if expected equals actual
        assertEquals(5, 2 + 3);

        // Checks if condition is true
        assertTrue(5 > 3);

        // Checks if condition is false
        assertFalse(5 < 3);

        // Checks if value is null
        assertNull(null);

        // Checks if object is not null
        assertNotNull(new Object());
    }
}