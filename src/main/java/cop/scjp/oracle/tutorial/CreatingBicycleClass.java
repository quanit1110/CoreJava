package cop.scjp.oracle.tutorial;

/**
 * Created by mitalcs on 11/26/14.
 */
public class CreatingBicycleClass {
    //creating instance variable
    private int gear;
    private int speed;
    private int cadence;

    public void changeGear (int newValue){
        gear = newValue;
    }
    public void changeCadence (int newValue){
        cadence= newValue;
    }
    public void speedUp (int increment){
        speed += increment;
    }
    public void applyBrake (int decrement){
        speed-= decrement;
    }

    public void printStates(){
        System.out.println ("Cadence : "+ cadence + "  Speed : " + speed + "  Gear : "+ gear );
    }
}
