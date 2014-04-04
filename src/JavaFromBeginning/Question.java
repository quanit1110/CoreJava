package JavaFromBeginning;

import java.util.Scanner;

public class Question {
	//Demonstrating product, sum, difference, quotient of 2 numbers
	// Taking input from user using Scanner.
	public static void main(String[] args) {
		int x, y, difference, product, sum, quotient;
		System.out.print("Enter number 1 : ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.print("Enter number 2 : ");
		y = sc.nextInt();

		difference = x - y;
		System.out.printf("Difference is %d\n", difference);

		product = x * y;
		System.out.printf("Product is %d\n", product);

		sum = x + y;
		System.out.printf("Sum is %d\n", sum);

		quotient = x % y;
		System.out.printf("Quotient is %d\n", quotient);

		if (x > y) {
			System.out.println("x is lager");
		} else if (y > x) {
			System.out.println("y is larger");
		} else {
			System.out.println("Both are equal");
		}

	}

}