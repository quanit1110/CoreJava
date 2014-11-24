
/**
 * Created by mitalcs on 9/25/14.
 */
public class StringReverse {
   public String reverseString (String input){
       if (input == null){
           return null;
       }
           String reverseString = "";
           String a = input;

       for (int i = a.length() - 1; i>=0; i--){

          reverseString = reverseString + a.charAt(i);
       } return reverseString;

   }

    public String reverseSentence (String input){
        if (input == null){
            return null;
        }
        String reverseSentence = "";
        String[] a = input.split(" ");

        for (int i = a.length - 1; i >= 0; i--){
            reverseSentence += a[i] + " ";
        }
        return reverseSentence;
    }
    public static void main (String [] args){
        StringReverse sr = new StringReverse();
        System.out.println (sr.reverseString("Hello World"));
        System.out.println (sr.reverseSentence("You are my world"));
    }
}
