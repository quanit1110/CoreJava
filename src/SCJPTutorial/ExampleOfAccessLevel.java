package SCJPTutorial;

/**
 * Created by mitalcs on 9/15/14.
 */
public class ExampleOfAccessLevel {

    //Declaring instance variable as public
    //This will available to use to other classes whether in same package or other package.

    public int sum;

    //Declaring instance variable as default
    //This will available to use to other classes within same package.
    //If we try to use this variable in different package it will throw error.

     protected double month;


    // Declaring instance variable as private
    //This will available to use to other class within the same class. i.e. to inner class

    private short ss;
}



class TestPrivateAccessLevel{
    //This will throw error as it is trying to call private instance variable to another class
    //ExampleOfAccessLevel.ss=10;

}