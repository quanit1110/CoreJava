import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mitalcs on 10/6/14.
 */
public class ArraySumTest{
    @Test

    public void checkArraySum(){
        ArraySum as = new ArraySum();
        int var = as.sum(new int[] {1,2,3,4,5 });

         assertEquals(15, var);
         assertEquals (0, as.sum(new int []{}));
    }
}
