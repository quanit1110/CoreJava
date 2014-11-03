package cop.introduction;

/**
 * Created by Mital Jani on 11/3/14.
 * Demonstrating the different type of variables to store values in it.
 */
public class UsingVariables {
    static int myStaticVariable;
    int myInstanceVariable;

    public void printVariables() {
        // declaring and initializing local variables
        // Local variables must be initialized before using it.

        byte myByte = 127;
        short myShort = 3300;
        int myInt = 330000;
        double myDouble = 1234567.00;
        long myLong = 1111111111;
        float myFloat = 123456.00f; // By default value will be double. For explicitly declaring it as float, mention f at the end of value
        char myChar = 'f';
        boolean myBoolean = true; //boolean can hold only two values: true or false.

        System.out.println("Printing values of byte : " + myByte);
        System.out.println("Printing values of short : " + myShort);
        System.out.println("Printing values of int : " + myInt);
        System.out.println("Printing values of double : " + myDouble);
        System.out.println("Printing values of long : " + myLong);
        System.out.println("Printing values of float : " + myFloat);
        System.out.println("Printing values of char : " + myChar);
        System.out.println("Printing values of boolean : " + myBoolean);
        System.out.println("Printing values of instance variable : " + myInstanceVariable);
        System.out.println("Printing values of static variable : " + myStaticVariable);


    }

    public static void printMe() {
        //Creating object of class.
        UsingVariables uv = new UsingVariables();
        System.out.println("Printing values of instance variable in static method : " + uv.myInstanceVariable);
        System.out.println("Accessing Instance Method in Static Method through object ");
        uv.printVariables();
        System.out.println("Printing values of static variable : " + myStaticVariable);
    }


}
