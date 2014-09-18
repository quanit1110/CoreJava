package Testing;


/**
 * Created by mitalcs on 9/15/14.
 */
public class TestExampleOfAccessLevel {
    public static void main (String [] args){

        //This is one way of specifying import statement by giving fully qualified class name.
        //But this is not recommended.

        SCJPTutorial.ExampleOfAccessLevel eg = new SCJPTutorial.ExampleOfAccessLevel();
        //Can access public access level
        eg.sum = 10;
        System.out.println(eg.sum);

    }
}
