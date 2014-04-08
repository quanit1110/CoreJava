package JavaFromBeginning;

import java.util.Scanner;

public class CalculateRadius {
//Calculating diameter, circumference and area of circle
// Taking input as integer and cast to float.
//Also using Math class to determine value of Pi.

	public static void main(String[] args) {
		System.out.println("Enter the radis of circle");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();

		// float diameter = (2 * radius);
		// float circumference = (float) ( 2 * Math.PI * radius);
		// float area = (float)(Math.PI *(Math.pow(radius, radius)));

		System.out.printf("Diameter of circle is %d\n", 2 * (radius));
		System.out.printf("Circumference of Circle is %f\n",
				(float) (2 * Math.PI * radius));
		System.out.printf("Area of Circle is %f\n",
				(float) (Math.PI * Math.pow(radius, 2)));
		

	}

}
