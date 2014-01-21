/**
 * Demonstrating the use of int and long data type. Chapter 3 Core Java
 * 
 * @author Mital Jani
 */
public class IntegerDataTypeExample {
	public static void main(String[] args) {

		// demonstrating that if we declare int data type then the output will
		// be treamed to the size of int.
		int days;
		int seconds;
		int lightspeed;
		int distance;

		lightspeed = 186000;
		days = 1000;
		seconds = days * 24 * 60 * 60;
		distance = seconds * lightspeed;

		System.out.print("In " + days);
		System.out.print(" days, light will travel about ");
		System.out.println(distance + " miles");

		// Actual demonstration of explaining the long type.
		int lightspeed1;
		long days1;
		long seconds1;
		long distance1;
		lightspeed1 = 186000;
		days1 = 1000;

		seconds1 = days1 * 24 * 60 * 60;
		distance1 = lightspeed1 * seconds1;

		System.out.print("In " + days1);
		System.out.print(" days, light will travel about ");
		System.out.println(distance1 + " miles");
	}
}
