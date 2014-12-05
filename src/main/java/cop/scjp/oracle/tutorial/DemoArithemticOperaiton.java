package cop.scjp.oracle.tutorial;

/**
 * Created by mitalcs on 12/5/14.
 */
public class DemoArithemticOperaiton {
    int result;
    public void operation(int n1, int n2){
       int result = n1 +n2;
        System.out.println ("n1 + n2 = " + result);
        int originalResult = result;

        result -= 1;
        System.out.println (originalResult + "- 1  = " + result);

        originalResult = result;

        result *= 2;
        System.out.println (originalResult + "* 2 = " + result );
        originalResult = result;

        result /= 2;
        System.out.println (originalResult + "/ 2 = " + result );
        originalResult=result;

       result%=2;
       System.out.println (originalResult + "% 2 = " + result );

    }
    public void testOperand (){
        result++;
       System.out.println (result);

    }

    public static void main (String...args){
        DemoArithemticOperaiton dmo = new DemoArithemticOperaiton();
       dmo.operation(10,5);
        dmo.testOperand();
    }
}
