package cop.scjp.oracle.tutorial;

/**
 * Created by mitalcs on 12/3/14.
 */
public class ArrayCopyDemo {


    public static void main (String...args){
        String[] arr = {"Mital", "Jani", "Hardik", "Mahant", "Gotu", "Maru", "Pyaru"};
        String[]arr1 = new String[5];
        System.arraycopy(arr,0,arr1,0,3);

        for (int i=0; i < arr1.length; i++){
            System.out.println (arr1[i]);
        }

    }
}
