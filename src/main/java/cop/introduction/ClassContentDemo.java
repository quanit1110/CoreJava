package cop.introduction;

/**
 * Created by Mital Jani on 11/2/14.
 */
public class ClassContentDemo {
    //Class can only contain class members

    //Static variable
    static int staticVariable;

    //Instance variable
    int instanceVariable = 0;

    //Static Method
    public static void printMe() {
        System.out.println("This is Static Method");
    }

    //Instance Method
    public void printInstanceMethod() {
        System.out.println("Wooooohoooo I am in Instance Method");
    }

    //Static block
    static {
        System.out.println("I am static block.");
    }

    //Instance block
    {
        System.out.println("I am instance block.");

    }

}
