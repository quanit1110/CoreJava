package cop.scjp.oracle.tutorial;

/**
 * Created by mitalcs on 12/3/14.
 */
import java.util.Arrays;
public class MethodsOfArrayClass {

    // Demonstrating the copyOfRange method of Array Class
    public void demoCopyOfRangeMethod(String[] arr1, int n) {
        String[] newnames = Arrays.copyOfRange(arr1, 0, n);
        for (String arr : newnames) {
            System.out.println(arr);
        }
    }

    //Demonstrating the BinarySearch method of Array Class.
    public int demoBinarySearchMethod(int[] arr, int key) {
      Arrays.sort(arr);
        for (int i=0; i< arr.length;i++){
            System.out.println("sorted array is : " + arr[i]);
        }
        int searchNum = Arrays.binarySearch(arr,0,3,key);
        System.out.println(searchNum);
        return searchNum;
    }


    public static void main(String... args) {
        MethodsOfArrayClass moa = new MethodsOfArrayClass();
        System.out.println ("Demonstrating the copyOfRange method");
        String[] input = {"Mital", "Hardik", "Gotu", "Maru", "Pyaru", "Jaanu", "Mari"};
        moa.demoCopyOfRangeMethod(input, 7);
        System.out.println ("Demonstrating the BinarySearch method");
        int[] input1 = {1,10,60,100,50,30,2,7,10,6};
        moa.demoBinarySearchMethod(input1,50);
    }


}

