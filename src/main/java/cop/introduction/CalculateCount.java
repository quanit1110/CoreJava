package cop.introduction;

import java.util.Scanner;

/**
 * Created by Mital Jani on 11/4/14.
 * This program will calculate the counts the number of students whose weight is less than 50 kg
 * and height is greater than 170 cms
 */
public class CalculateCount {
    public void calCountOfStudent() {
        int count = 0;
        double height = 0;
        double weight = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height and weight of 10 students");
        for (int i = 0; i < 10; i++) {
            height = sc.nextDouble();
            weight = sc.nextDouble();

            if (height > 170 && weight < 50) {
                count++;
            }
        }
        System.out.println("Number of Student is : " + count);

    }

    public void printCount(double[] height, double[] weight) {
        double[] h = height;
        double[] w = weight;
        int count = 0;
        for (int i = 0; i < h.length; i++) {
            if (h[i] > 170 && w[i] < 50) {
                count++;
            }

        }
        System.out.println("Number of student is : " + count);
    }

    public static void main(String... args) {
        CalculateCount cc = new CalculateCount();
        cc.calCountOfStudent();
        double[] hei = {170, 150, 180, 190, 140, 200, 250, 150};
        double[] wei = {70, 50, 30, 90, 40, 20, 25, 15};

        cc.printCount(hei, wei);
    }

}
