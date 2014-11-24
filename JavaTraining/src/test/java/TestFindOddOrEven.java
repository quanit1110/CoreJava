import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * testing FindOddOrEven
 */
public class TestFindOddOrEven {
    @Test
    public void testOdd (){
        FindOddOrEven foe = new FindOddOrEven();
        assertTrue(foe.isOdd(5));
        assertFalse(foe.isOdd(2));
        assertFalse(foe.isOdd(0));
    }
}
