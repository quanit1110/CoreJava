import java.util.Random;
import java.util.Scanner;

/**
 * Created by mitalcs on 10/10/14.
 */
public class RandomList81299 {

    Scanner sc = new Scanner (System.in);
    Random rd = new Random();
    int max = Integer.MIN_VALUE; // MIN VALUE range of input i.e �2147483647
    int min = Integer.MAX_VALUE; // MAX VALUE range of input i.e +2147483647
    int randomNo;

    public void printRandom (){
        System.out.print("Enter the upper limit: ");
        int upperLimit = sc.nextInt();
        System.out.print ("\nEnter the count of numbers: ");
        int count = sc.nextInt();
        System.out.println ("Random numbers are : ");
        for (int i = 1; i<= count; i++) {
            randomNo = rd.nextInt(upperLimit);
            System.out.print(randomNo + "\t");
            if (i % 15 == 0) {
                System.out.println("\n");
            }


            if (randomNo > max) {
                max = randomNo;
            }


            if (randomNo < min) {
                min = randomNo;
            }
        }

        System.out.println ("\nLargest random number is : " + max);
        System.out.println ("Smallest random number is : " + min);

    }

    public static void main (String [] args){
        RandomList81299 rl = new RandomList81299();
        rl.printRandom();
    }
}
