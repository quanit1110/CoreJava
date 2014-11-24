import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by mitalcs on 10/6/14.
 */
public class PalindromeNumberTest  {
     @Test
     public void checkPalindromeNumber (){
       PalindromeNumber pn = new PalindromeNumber();
        assertTrue (pn.isPalindromeNumber(121));
        assertTrue (pn.isPalindromeNumber(0));
        assertFalse(pn.isPalindromeNumber(12345));
        assertTrue (pn.isPalindromeNumber(1));
        assertTrue (pn.isPalindromeNumber(-121));





    }

}
