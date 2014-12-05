package cop.introduction;

/**
 * Created by mitalcs on 11/23/14.
 */
public class DemoFinalMethod {
     String name;

    public final void printMe (){
        name = "Mital";
        System.out.println ("Hello " + name);
    }

public static void main (String...args){
    DemoFinalMethod dfm = new DemoFinalMethod();
    dfm.name = "XYZ";
    dfm.printMe();

}
}
