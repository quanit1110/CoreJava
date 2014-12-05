package cop.scjp.oracle.tutorial;

/**
 * Created by mitalcs on 12/2/14.
 */
public class ArrayDemo {
    int[]arr123;
    public void arrayReturn(int[] arr){
        int[] arryOfNum = arr;
        for (int i = 0; i < arryOfNum.length; i++){
            System.out.println ("Element " + i+1 + " at index "+ i + " is : " + arryOfNum[i]);
        }
    }

    public void mulitiDimensionalArray(){
      String [][]arr = {{"Mr.", "Mrs.", "Ms."}, {"Smith", "John"}};
       // String [][] arr = {{},{}};
      System.out.println (arr[0][0] + arr[1][0]);
      System.out.println (arr.length);
    }

    public static void main (String...args){
        ArrayDemo ad = new ArrayDemo();
        //int[]arr1 = {5,10,15,20,25,30,35};
        int[]arr1 = {};

       System.out.println (ad.arr123) ;
        ad.arrayReturn(arr1);
        ad.mulitiDimensionalArray();
    }
}
