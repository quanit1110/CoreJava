package cop.introduction;

import java.util.Scanner;

/**
 * Created by Mital Jani on 11/4/14.
 */
public class CalculateRatio {
    /*
     * Calculate Ratio using input entered by user.
     * Using Scanner to prompt input.
     */
    Scanner sc = new Scanner(System.in);
    private double result;
    public void calculateRatio() {
        double a, b, c, d;

        System.out.print("Enter value of a : ");
        a = sc.nextDouble();
        System.out.print ("\n");
        System.out.print("Enter value of b :");
        b = sc.nextDouble();
        System.out.print ("\n");

        System.out.print("Enter value of c :");
        c = sc.nextDouble();
        System.out.print ("\n");

        System.out.print("Enter value of d :");
        d = sc.nextDouble();
        System.out.print ("\n");

        if (c - d != 0) {
            result = (a + b) / (c - d);
            System.out.println("Ratio of this number is : " + result);
        }
    }
    /* Calculate ratio using input as parameter in method.
        @return result
     */
    public double calratio (double a, double b, double c, double d){
        double n1, n2, n3, n4;
        n1 = a;
        System.out.println ("Value of a is : " + n1);
        n2 = b;
        System.out.println ("Value of b is : " + n2);
        n3 = c;
        System.out.println ("Value of c is : " + n3);
        n4 = d;
        System.out.println ("Value of d is : " + n4);

        if (n3-n4 != 0){
            result = (n1 + n2)/(n3 - n4);
        }
        return result;
    }
     //Printing ratio
    public void printRatio (){
        System.out.println ("Ratio of number entered is : " + result);
    }

    public static void main (String...args){
        CalculateRatio cr = new CalculateRatio();
        cr.calculateRatio();
        cr.calratio(10,20,3,2);
        cr.printRatio();
    }

}
