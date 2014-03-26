
public class BooleanDataTypeExample {
	public static void main (String [] args){

		boolean b;
		b = false;
		System.out.println ("b is : " + b);
		b = true;
		System.out.println ("b is : "  + b);
		
		// boolean value controlling the if statement
		//Below statement will get executed as b's value is true
		
		if (b){
			System.out.println ("This is executed");
		}
		//Below statement will not executed as b's value is false and it will check for condition b = true
		b = false;
		if (b){
			System.out.println ("This is not executed");
		}
		//Below statement will executed as b's value is false and it will check for condition b = false
		if (b == false){
			System.out.println ("This will again executed");
		}
		//Relational operator
		System.out.println ("10 > 9  is " + (10 > 9));
	}

}
