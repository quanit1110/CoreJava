public class PrimitiveAndObjectReferenceDifference {

	//Decalaring primitive type static variable but not initialized.
	//In this case, when it is used, it will have default value (0) when it is used.
	// Another point to remember, Here I have declared static variable because we cannot call non -static varaible in static method of main ().
	//Static variable can be used only in static method. 

	static int i;
	static double d;
	static char c;
	static short s;
	static float f;
	static long l;
	//Declaring Object Reference Type static variable but not initialized.
	//In this case, it will have default value (Null) when it is used.
	static String st;

	//Declaring Boolean Type static variable but not initialized.
	//In this case, it will have default value (False) when it is used.
	static boolean b;
	
	public static void main (String [] args){
		//Declaring primitive and object reference type local variable but not initialized.
		//In this case, when it is used, it will throw compilation error.

		int ii;
		double dd;
		char cc;
		short ss;
		float ff;
		long ll;
		String stt;
		boolean bb;

		//Using instance varaible without initialization.
		// It will have default value

		System.out.println (i);
		System.out.println (d);
		System.out.println (c);
		System.out.println (s);
		System.out.println (f);
		System.out.println (l);
		System.out.println (st);
		System.out.println (b);

		//Using local variable without initialization.
		//It will throw compilation error that variable __ might not have been initialized.
		System.out.println (ii);
		System.out.println (dd);
		System.out.println (cc);
		System.out.println (ss);
		System.out.println (ff);
		System.out.println (ll);
		System.out.println (stt);
		System.out.println (bb);
		
	}
	

}