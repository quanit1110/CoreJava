import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mitalcs on 10/5/14.
 */

public class TestPalindrome {
    @Test
    public void TestPalindromeWord () {
        CheckPalindrome cs = new CheckPalindrome();
        assertTrue(cs.isPalindromeInefficient("madam"));
        assertTrue(cs.isPalindromeInefficient("Madam"));
        assertTrue(cs.isPalindromeInefficient("nitiN"));
        assertFalse(cs.isPalindromeInefficient("Mital"));
        assertFalse(cs.isPalindromeInefficient("123"));
        assertTrue(cs.isPalindromeInefficient("#######"));
        assertTrue(cs.isPalindromeInefficient("555555"));
        assertTrue(cs.isPalindromeEfficient("12#21"));
        assertTrue(cs.isPalindromeInefficient(null));
    }
        @Test
        public void testPlaindromWordEfficent () {
            CheckPalindrome cs1= new CheckPalindrome();

            assertTrue(cs1.isPalindromeEfficient("madam"));
            assertTrue(cs1.isPalindromeEfficient("Madam"));
            assertTrue(cs1.isPalindromeEfficient("nitiN"));
            assertFalse(cs1.isPalindromeEfficient("Mital"));
            assertFalse(cs1.isPalindromeEfficient("123"));
            assertTrue(cs1.isPalindromeEfficient("#######"));
            assertTrue(cs1.isPalindromeEfficient("555555"));
            assertTrue(cs1.isPalindromeEfficient("12#21"));
            assertTrue(cs1.isPalindromeEfficient(null));

        }
    }
