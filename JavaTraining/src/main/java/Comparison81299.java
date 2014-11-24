/**
 * Created by mitalcs on 9/26/14.
 */
import java.util.Scanner;
public class Comparison81299 {
    public static void main (String [] args){
            String input1= "";
            String input2= "";
            Scanner sc = new Scanner (System.in);
            System.out.println ("Enter First String");
            input1 = sc.nextLine ();
            System.out.println ("Enter Second String");
            input2 = sc.nextLine();
           // int counter = input1.compareTo(input2);
            if (input1.compareTo(input2) <0 ){
                System.out.printf (input1 + "\n" + input2);
        }   else System.out.printf (input2 + "\n" + input1);

        }

    }
