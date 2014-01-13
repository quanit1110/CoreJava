package coreJavaChap2;

public class IfSample {
	public static void main(String args[]) {
		int x, y;
		x = 10;
		y = 20;

		if (x < y) {
			System.out.println("X is less than Y");
		}
		x = x * 2;
		System.out.println(x);
		if (x == y) {
			System.out.println("X is now equal to Y");

		}
		x = x * 2;
		System.out.println(x);
		if (x > y) {
			System.out.println("X is now greater than Y");
		}
		
		if (x==y){
			System.out.println ("This statement will not execute as x is 40 and y is 20");
		}
	}

}
