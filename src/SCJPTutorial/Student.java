package SCJPTutorial;

public class Student {
  //Declaring instance variable
	String name = "John"; //Object Reference Type
	public int rollNum = 50; //Primitive Type
	public static int sval = 1000; //static variable --> Primitive Type
	public static String sStr = "XYZ"; //static variable --> Object Reference Type
	
	public void m1(){ //instance variable
		Student.sval = 3000;
		int var = 90;
		rollNum = 700; // Good practice is to write this.rollNum to refer Instance Variable
		int rollNum = 800;
		this.rollNum = 850; //Referring Instance Variable by explicitly telling this.rollNum
		rollNum = 550; /*
						this time it will refer to local variable as once we create local variable it will hide referring instance variable unless
		 				we call explicitly by this.rollNum. Note that we call instance variable rollNum directly in line number 13. Because at that
		 				point of time local variable was not created and we can refer directly although its not good practice. Once local variable 
		 				is created it will hide referring to instance variable.
		 				*/
		sval = 6000;
		System.out.println ("M1");
		
	}
	public static void s1(){ // static method
		int flag = 90;
		System.out.println ("S1");
		
	}
	
	public static void main (String [] args){
//		int val = 900; //local variable --> Primitive Type
//		String str = "abc"; // local variable --> Object Reference Type
//		Student st = new Student (); //Object Creation
//		Student st1 = new Student ();
//		System.out.println (st.name); //Accessing instance variable
//		Student.s1(); // Accessing static members
//		Student.sval = 5000;
//		Student.sStr = "123";
//		st1.m1();
	}
}
