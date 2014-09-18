package SCJPTutorial;

/**
 * Created by mitalcs on 9/15/14.
 */
public class TestingAccessLevel extends ExampleOfAccessLevel {
    public static void main (String [] args){
        //As this class is within the same package we do not need to import that class in order to create object
        ExampleOfAccessLevel eg = new ExampleOfAccessLevel();

        //Using the default access level.
        //Default can be used to any class within the same package.
//        eg.month = 12;
//       System.out.println (eg.month);

        //Using the private access level
        //This will throw error
       // eg.ss;
    }
    public void m1(){
        month = 13;
        sum= 13;
    }
}
