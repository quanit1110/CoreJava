/** This class will invoke all methods describe in Bicycle class by creating its object.
* Main method is the entry point of application. 
*It takes single parameter usually named args but here for testing purpose I have defined mj whose type is an array of String object. 
*/

public class BicycleDemo {
	public static void main (String [] mj){
		//Create three dfferent Bicycle object
		Bicycle bcy1 = new Bicycle();
		Bicycle bcy2 = new Bicycle();
		Bicycle bcy3 = new Bicycle();

// Printing default values 
	bcy1.printAllStates();

// Invoking methods
	bcy2.changeCadence(100);
	bcy2.changeGear(3);
	bcy2.speedUp (70);
	bcy2.printAllStates();

	bcy3.changeCadence(80);
	bcy3.changeGear(2);
	bcy3.speedUp(50);
	bcy3.speedUp(30);
	bcy3.speedDown(20);
	bcy3.changeGear(3);
	bcy3.printAllStates();

	}
	
}