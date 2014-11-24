import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mitalcs on 9/25/14.
 */
public class TestnthFibonacci {
    @Test
    public void testRecursion (){
        FindFibonnaci ff = new FindFibonnaci();
        assertEquals ("results must be same", ff.nthFibonacciRecursion(5), ff.nthFibonacciIteration(5) );
    }
}
