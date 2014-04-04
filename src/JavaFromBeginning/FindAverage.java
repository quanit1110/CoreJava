package JavaFromBeginning;
import java.util.Scanner;

public class FindAverage {
	//Showing how to compute average by taking n numbers from user.
	public static void main (String []args){
		System.out.println ("Enter numbers and type 0 to execute program");
		Scanner sc = new Scanner (System.in);
		
		int value = -1, sum = 0, count = 0;
		
		while ((value = sc.nextInt() )!=0){
			sum = sum +value;
			count++;
		}
		int average = sum/count;
		System.out.println("Average of numbers you entered is : "+ average);
		
	}

}
