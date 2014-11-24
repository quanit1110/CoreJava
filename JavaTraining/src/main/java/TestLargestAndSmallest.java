import java.util.Scanner;

/**
 * Created by mitalcs on 10/9/14.
 */
public class TestLargestAndSmallest {
/*
 * Java Program to calculate the smallest, largest and average value of the numbers input by user
 * @author Shweta Verdia Student ID 84224
 */
        public static void main(String args[]) {
            // Declaring variables and initializing them for calculation
            int n, count = 0, sum = 0;
            double average = 0;
            int max = Integer.MIN_VALUE; // MIN VALUE range of input i.e –2147483647
            int min = Integer.MAX_VALUE; // MAX VALUE range of input i.e +2147483647

            System.out.println("This program calculates the smallest, largest, and average value");
            System.out.println("Enter -1 to stop.");
            System.out.println("Enter number " + (count + 1) + ":");
            Scanner in = new Scanner(System.in);// Creating object of Scanner class to get input from command line
            n = in.nextInt(); // Storing input number prompted by user into n variable.

            while (n != -1) {//  used While loop with condition to find largest, smallest values, -1 as Sentinel value to denote end of data set

                if (n > max) {
                    max = n;
                }

                if (n < min) {
                    min = n;
                }
                //Checking the condition that input cannot be less than -1 and if so then print error message.
                //Using continue so that it will bring back to its loops for further iteration.
                if (n < -1) {
                    System.out.println("Input Number cannot be less than -1. Try Again");
                    System.out.println("Enter number " + (count + 1) + ":");
                    n = in.nextInt();
                    continue;
                }
                //Checking the condition that input is equal to -1 than break the loop and proceed further.
                if (n == -1) {

                    break;
                }

                //Adding n to sum.
                sum = sum + n;
                count++;

                System.out.println("Enter number " + (count + 1) + ":");
                n = in.nextInt(); //
            }
            average = (double) sum / count; //Casting sum to double so that it will return the result to double and will store it in average.
            //Executing the print statement of largest number, smallest number and average.
            System.out.println("Largest Number is: " + max);
            System.out.println("Smallest Number is: " + min);
            System.out.println("Average is: " + average);
        }
    }