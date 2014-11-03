package cop.introduction;

/**
 * Created by Mital Jani on 11/3/14.
 */
public class WhileLoopDemo {
    int year = 1900;

    public void findLeapYear() {
        while (year < 2200) {
            if (year % 4 == 0) {
                System.out.println("Leap Year is : " + year);
                year++;
            }
            year++;
        }
    }

    public static void main(String... args) {
        WhileLoopDemo wld = new WhileLoopDemo();
        wld.findLeapYear();
    }
}
