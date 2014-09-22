package SCJPTutorial;

/**
 * Created by mitalcs on 9/18/14.
 */
public class FinalModifierDemo {

    //Declaring one method that returns nothing.
    public void m1(){
        System.out.println ("In first class");
    }

}

class ExtendedFinalClass extends FinalModifierDemo{
    //Overriding method m1 and make it final
    //Declaring method as final, it cannot be override in its any subclass. It will be final forever
    public final void m1(){
        System.out.println ("In second class");
    }
}

//Declaring final class.
//Making any class final will not allow to extend its class further. It means that this will be last class in inheritance chain
final class SecondExtendedFinalClass extends ExtendedFinalClass{
    //Trying to override the final method
    //This will throw compilation error.

//    public void m1(){
//        System.out.println ("Trying to override final method");
//    }
   //Inheriting the final method
    ExtendedFinalClass efc = new ExtendedFinalClass();
    public void m2(){
        efc.m1();
    }

}



//Trying to inherit the final class
//This will give compile time error

//class ThirdExtendedClass extends SecondExtendedFinalClass{
//
//}

//Demonstrating Final modifier in Object Reference Type Variable

class ObjectRefDemo extends Student{
    public static void main (String [] args){
        final Student st = new Student(); // 1000x in memory
        //Trying to modify the final variable
       // st = new Student(); // 2000x in memory

        //Trying to modify the final variable to null
        //Although set to null, this results in change of value
        //st = null;

        // This change is valid because we are not changing the value of st.
        // We are changing the value of name.
        st.name = "abc";

    }


}

