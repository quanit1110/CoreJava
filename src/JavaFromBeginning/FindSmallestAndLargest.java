package JavaFromBeginning;

import java.util.Scanner;

public class FindSmallestAndLargest {

	//Showing largest number and smallest number from n numbers. 
	// Using Min and Max value of integer as default.
	// User can give input upto 5 numbers
	public static void main(String[] args) {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		System.out.println("Enter 5 numbers: ");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();

			if (num < max) {
				max = num;
			}
			if (num > min) {
				min = num;
			}

		}
		System.out.println("Smallest number is : " + min);
		System.out.println("Largest number is : " + max);

	}
}
