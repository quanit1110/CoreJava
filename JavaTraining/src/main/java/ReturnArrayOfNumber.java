import java.util.ArrayList;
import java.util.List;

/**
 * Created by mitalcs on 10/7/14.
 */
public class ReturnArrayOfNumber {

    public int[] returnArray (int n, int [] arr){

        if (arr.length == 0){
            return null;
        }
        for (int i = 0; i < arr.length; i ++){
                for (int j = 0; j < arr.length - 1; j++){
                    if (arr[i] + arr[j] == n){
                        arr = new int [] {arr[i], arr[j]};
                        return arr;
                    }
                }
        }
        return arr;
    }

    public List<Integer> returnArrayListOfSumN (int n, int [] arr){

        if (arr.length == 0){
            return null;
        }

        List<Integer> resultList = new ArrayList<Integer>(2);

        for (int i = 0; i < arr.length; i ++){
                for (int j = 0; j < arr.length - 1; j++){
                    if (arr[i] + arr[j] == n){
                       resultList.add(arr[i]);
                       resultList.add(arr[j]);
                        return resultList;
                    }
                }
        }
        return resultList;
    }


    public static void main (String...args){
        ReturnArrayOfNumber ran = new ReturnArrayOfNumber();
        int[] var = new int[]{1,2,3,4,5,6,7,8,9,10};


        System.out.println (ran.returnArrayListOfSumN(5, var));
    }
}


