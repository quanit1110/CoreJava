
public class CharacterDataTypeExample {
public static void main (String [] args){
	char ch1, ch2;
	ch1= 88; 
	ch2 = 'Y';
	
	// Here ch1 is assigned to value 88. But as its data type is 88 and as per unicode 88 has value 'X' so the output will be 'X' instead of 88.
	
	System.out.println ("Value of ch1 : " + ch1);
	System.out.println("Value of ch2 : " + ch2);
	
	//Demonstrating arithmetic operations on character
	
	char a;
	a = 'A';
	System.out.println ("Value of a : " + a);
	a++;
	System.out.println ("Value of a is now : " + a);
	
	char alpa;
	for (alpa = 'A' ; alpa <= 'Z'; alpa++){
		System.out.println (alpa);
		
	}
}
}
