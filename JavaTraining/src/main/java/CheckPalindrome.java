/**
 * Created by mitalcs on 10/3/14.
 */
public class CheckPalindrome {

    public boolean isPalindromeInefficient(String str){
        if (str ==(null)){
            return true;
        }

        char[] reverse = new char[str.length()];
        char [] chars = str.toCharArray();
        for (int i = str.length()-1, j = 0; i >-1; i--, j++){
            reverse[j] = chars[i];
        }
        String revString = new String (reverse);

        if (revString.toLowerCase().equals(str.toLowerCase())){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPalindromeEfficient(String str) {
        if (str == null)
        {
            return true;
        }
        for (int i = 0, j = str.length() - 1; j >= i; i++, j--) {
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                return false;
            }
        }
        return true;

    }

}
