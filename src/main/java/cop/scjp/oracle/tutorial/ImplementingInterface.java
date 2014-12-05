package cop.scjp.oracle.tutorial;

/**
 * Created by mitalcs on 11/26/14.
 */
public class ImplementingInterface implements DeclaringInterface {
    @Override
    public void printMe() {
        System.out.println ("Hello Universe");
    }

    @Override
    public void tobeOverriden() {
        System.out.println ("Dont know what to write");

    }

public static void main (String...args){
    ImplementingInterface im = new ImplementingInterface();
    im.printMe();
    im.tobeOverriden();
}
}
