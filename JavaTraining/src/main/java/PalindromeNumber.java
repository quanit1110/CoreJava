/**
 * Created by mitalcs on 10/6/14.
 */
public class PalindromeNumber {
    public int reverse (int number){
        int reverse = 0;
        while (number !=0){
            reverse = reverse *10 + number %10;
            number = number/10;
        }
        return reverse;
    }

    public boolean isPalindromeNumber (int number){
        if (number == reverse(number)){
            return true;
        }
        return false;
    }
}
