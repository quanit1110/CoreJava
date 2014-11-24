/**
 * Created by mitalcs on 9/30/14.
 */
public class ArraySum {

    int sum(int []arr) {
        if (arr == null){
            return 0;
        }
        int[] num = arr;
        int sum = 0;
        for (int i = 0; i <= num.length-1; i++) {
            sum += num[i];
        }
        return sum;
    }
}
