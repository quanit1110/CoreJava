/** This program illustrate the definition of object, its state and its behaviour
*In programming language an object stores its state in fields and exposes its behaviour through methods.
*/
public class Bicycle{
	private int gear = 1;
	private int speed = 0;
	private int cadence = 0;

	void changeCadence (int newCadence){
		cadence = newCadence;
	}

	void changeGear (int newGear){
		gear = newGear;
	}

	void speedUp (int increment){
		speed= speed + increment;
	}

	void speedDown (int decrement){
		speed = speed -decrement;
	}

	void printAllStates(){
		System.out.println ("cadence : "+ cadence + "speed : " + speed + "gear : " + gear);
	}

}