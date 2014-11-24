import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by mitalcs on 10/7/14.
 */
public class ReturnArrayOfNumberTest {
    @Test
    public void testArrayElement() {
        ReturnArrayOfNumber ran = new ReturnArrayOfNumber();
        int[] var = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> result = (ran.returnArrayListOfSumN(5, var));

        assertEquals(2, result.size());
        assertTrue(result.contains(4));
        assertTrue(result.contains(1));
    }

    @Test
    public void testArrayListElement() {
        ReturnArrayOfNumber ran = new ReturnArrayOfNumber();

        int[] var = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> resultList = new ArrayList<Integer>();
        for( int i : ran.returnArray(5, var)){
            resultList.add(i);
        }
        assertEquals(2, resultList.size());
        assertTrue(resultList.contains(4));
        assertTrue(resultList.contains(1));




    }


}
