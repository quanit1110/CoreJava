/**
 * Created by mitalcs on 9/25/14.
 */
import java.util.ArrayList;
public class ArrayListSum {
    public int sum(ArrayList<Integer> arr) {
        int sum = 0;

        ArrayList<Integer> number1 = arr;
        for (int i = 0; i < number1.size(); i++) {
            System.out.println("Numbers: " + number1.get(i));
        }

        for (int i = 0; i < number1.size(); i++) {
            sum = sum + number1.get(i);
        }
        return sum;
    }


//
//    public int sum () {
//        int sum = 0;
//        ArrayList<Integer> number = new ArrayList<Integer>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter numbers to calculate sum");
//        int input = sc.nextInt();
//        if (input != -1) number.add(input);
//        else {
//            for (int i = 0; i < number.size(); i++) {
//                sum += number.get(i);
//            }
//
//        }return sum;

//
//    }
//    public void printMe (){
//        System.out.println (sum());
//    }
    public static void main(String[] args) {
        ArrayListSum fb = new ArrayListSum();
        ArrayList <Integer> var = new ArrayList<Integer>();
        var.add(5);
        var.add(6);
        var.add(7);
        var.add(8);

        System.out.println("Sum of all numbers : " +fb.sum(var));
    }

}






