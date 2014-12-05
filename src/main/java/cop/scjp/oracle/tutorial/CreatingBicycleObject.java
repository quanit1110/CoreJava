package cop.scjp.oracle.tutorial;

/**
 * Created by mitalcs on 11/26/14.
 */
public class CreatingBicycleObject {
    public static void main (String...args){
        CreatingBicycleClass bike1 = new CreatingBicycleClass();
        CreatingBicycleClass bike2 = new CreatingBicycleClass();

        bike1.changeCadence(4);
        bike1.changeGear(5);
        bike1.speedUp(10);
        bike1.applyBrake(3);
        bike1.printStates();


        bike2.changeCadence(10);
        bike2.applyBrake(10);
        bike2.speedUp(50);
        bike2.changeGear(6);
        bike2.printStates();

    }
}
