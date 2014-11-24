/**
 * Created by mitalcs on 10/8/14.
 */
public class PolymorphismDemo {

    public void m1(){
        System.out.println ("In Poly Demo");
    }
}

class Poly1 extends PolymorphismDemo{
    //Overriding the method of PolymorphismDemo Class
    public void m1(){
        System.out.println ("In Poly1 Class");
    }
}

class Test extends PolymorphismDemo{
     public static void main (String ... args){
        PolymorphismDemo pd= new PolymorphismDemo();
      // System.out.println (pd.m1());
    }
}
