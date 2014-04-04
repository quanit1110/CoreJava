package JavaFromBeginning;

import java.util.ArrayList;
import java.util.Scanner;

public class FindOddOrEvenOfNNumbers {

	//Demonstrating the method that will take n numbers from user and will compute whether its odd or even. 
	//Showing how to use StringBuilder and ArrayList
	public static void main(String[] args) {
		int value;
		StringBuilder evenString = new StringBuilder("Even numbers are: ");
		StringBuilder oddString = new StringBuilder("Odd numbers are: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers and press 0 to execute program");
		ArrayList<Integer> input = new ArrayList<Integer>();
		while ((value = sc.nextInt()) != 0) {
			input.add(value);
		}
		for (int i = 0; i < input.size(); i++) {
			int a = input.get(i);
			if (a % 2 == 0) {
				evenString.append(" " + a);
			} else {
				oddString.append(" " + a);
			}
		}
		System.out.println(evenString);
		System.out.println(oddString);
	}

}
