package coreJavaChap2;

public class ForLoopSample {
	public static void main(String args[]) {
		int x, y;

		for (x = 0; x < 10; x++) {
			System.out.println("This is x : " + x);
		}
		System.out
				.println("Here x is getting print from 0 to 9 as condition is only less than");
		System.out.println();
		for (y = 0; y <= 10; y++) {
			System.out.println("This is y : " + y);
		}
		System.out
				.println("Here y is getting print from 0 to 10 as condition is less than or equal to");

	}

}
