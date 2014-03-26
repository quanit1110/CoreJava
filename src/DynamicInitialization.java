
public class DynamicInitialization {

	public static void main(String[] args) {
		// a and b are initialized by constants
		double a = 3.0, b = 4.25;
		
	// c is dynamically initialized
		double c= Math.sqrt(a*a + b*b);
		System.out.println ("Hypothenuse is " + c);
// c uses Java built in method, sqrt() of class Math to compute the square root. 
	}

}
