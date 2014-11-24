import java.util.Scanner;

/**
 * Created by mitalcs on 10/27/14.
 */

public class ScoreCalculator81299 {

    public double averageOfArray(double[] arr1) {
        double total = 0;
        double average = 0;
        for (int i = 0; i < arr1.length; i++) {
            total += arr1[i];
            average = total / arr1.length;
        }
        return average;
    }

    public double getRandomNumber() {

        return Math.random() * 100;
    }

    public int getMinIndex(double[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            double min = arr[0];
            int minIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            return minIndex;
        }
    }

    public double[] deleteMinimum(double[] inputArr) {
        int minIndex = getMinIndex(inputArr);
        double[] newArray = new double[inputArr.length - 1];
        System.arraycopy(inputArr, 0, newArray, 0, minIndex);
        System.arraycopy(inputArr, minIndex + 1, newArray, minIndex, newArray.length - minIndex);
        return newArray;
    }

    public void printNewArray(double[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");

            total += arr[i];

        }
        System.out.println();
        System.out.println("Sum of new Array is : " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter count of an Array : ");
        int count = sc.nextInt();
        System.out.println();


        ScoreCalculator81299 sc1 = new ScoreCalculator81299();
        double[] values = new double[]{2, 4, 6, 7, 8, 9, 0, 11, 22, 33, 44, 55};
        double[] arr1 = new double[count];
        System.out.print("Elements in an array are : ");
        for (int i = 0; i < count; i++) {
            //  arr1[i] = sc1.getRandomNumber();
            arr1[i] = values[i];
            System.out.print(arr1[i] + " | ");
        }

        System.out.println();
        System.out.println("Average of an original array is :" + sc1.averageOfArray(arr1));
        //System.out.println ("Minimum index of an array is :" + sc1.getMinIndex(arr1));
        System.out.print("Elements in an new Array after deleting minimum number : ");
        double[] newArray = sc1.deleteMinimum(arr1);
        sc1.printNewArray(newArray);
    }

}
