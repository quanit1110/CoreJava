package cop.introduction;

import java.util.Scanner;

/**
 * Created by mitalcs on 11/6/14.
 */
public class CalculateSum {
    public void printSum (){
        int sum =0;
        Scanner sc = new Scanner(System.in);


        while (sc.nextInt() < 10){

            sum+=sc.nextInt();

        }System.out.println (sum);

    }

    public static void main (String...args){
        CalculateSum cs = new CalculateSum();
        cs.printSum();
    }


}
