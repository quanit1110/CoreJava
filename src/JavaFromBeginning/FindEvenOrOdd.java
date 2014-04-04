package JavaFromBeginning;


import java.util.Scanner;

public class FindEvenOrOdd {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter number to check even or odd");
		
		
		 int num = sc.nextInt();
		 if (num % 2 == 0){
		 System.out.println("Number is even");
		 }
		 else {
		 System.out.println("Number is odd");
		 }
		
		
	}

}
