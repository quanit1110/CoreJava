package cop.introduction;

/**
 * Created by mitalcs on 11/23/14.
 */
public class CalculateInterest {
    public void reverseString (String originalStr){
        String input = originalStr;
        String reverStr="";
        for (int i = input.length()-1; i >= 0; i--){
            reverStr +=input.charAt(i);
        }
        System.out.println ("Original String is : " + input);
        System.out.println ("Reverse String is : " + reverStr);
    }

    public static void main (String...args){
        CalculateInterest ci = new CalculateInterest();
        ci.reverseString("MITAL JANI IS GREAT JAVA LEARNER");
    }
}
