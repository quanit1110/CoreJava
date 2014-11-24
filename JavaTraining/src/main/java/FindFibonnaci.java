/**
 * Java program to demonstrate the nth fibonacci number.
 * Using recursion approach and iteration approach
 */
public class FindFibonnaci {
    public int nthFibonacciRecursion (int n){
        if (n <=1){
            return 1;
        }
        return nthFibonacciRecursion(n-1) + nthFibonacciRecursion(n-2);
    }

    public int nthFibonacciIteration (int n){
        int x = 0,y = 1,z = 1;

        for (int i = 0; i <=n; i++){
            x=y;
            y=z;
            z = x+y;
        }
        return 1;
    }
}
