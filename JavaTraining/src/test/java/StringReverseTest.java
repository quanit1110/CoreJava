import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by mitalcs on 10/6/14.
 */
public class StringReverseTest  {
    @Test
    public void checkStringReverse() {
        StringReverse sr = new StringReverse();
        assertEquals ("dlroW olleH",sr.reverseString("Hello World"));
       assertNotEquals("latim", "MITAL");
        assertEquals(null, sr.reverseString(null));
        assertEquals("", sr.reverseString(""));
    }

    public void checkStringReverseSentence (){
        StringReverse str = new StringReverse();
        assertEquals("world is heaven", str.reverseSentence("heaven is world"));
        assertEquals(null, str.reverseSentence(null));
        assertEquals(" ", str.reverseSentence(""));
    }
}
