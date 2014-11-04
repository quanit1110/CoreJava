package cop.introduction;

/**
 * Created by Mital Jani on 11/3/14.
 */
public class DemonstratingMethod {
    static UsingVariables u;
    public static void main (String[] args){
        UsingVariables uv;
        UsingVariables ab = new UsingVariables();
        /*
        To understand why this output comes to false... Please understand the concept of equals method.
        Look at the code of DemonstratingEqualsMethod class.. Demonstrating equals method therein.
         */
        uv = new UsingVariables();
        boolean b = uv == ab;
        boolean a = uv.equals(ab);
        System.out.println (u);
        System.out.println (b);
        System.out.println (a);
    }
}
