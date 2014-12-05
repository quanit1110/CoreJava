package cop.HarryTest;

/**
 * Created by mitalcs on 12/1/14.
 */
public class ImplementingQuestion2Test1 {
    public void printDay (Question2Test1 Days){
        switch (Days){
            case MONDAY:
                System.out.println(Days);
                System.out.println ("Hooray its working day");
                break;
            case TUESDAY:
                System.out.println (Days);
                System.out.println ("Hooray its working day");
                break;
            case WEDNESDAY:
                System.out.println(Days);
                System.out.println ("Hooray its working day");
                break;
            case THURSDAY:
                System.out.println(Days);
                System.out.println ("Hooray its working day");
                break;
            case FRIDAY:
                System.out.println(Days);
                System.out.println ("Hooray its working day");
                break;
            case SATURDAY:
                System.out.println(Days);
                System.out.println ("Ohhh No its Weekend");
                break;
            default:
                System.out.println (Days);
                System.out.println ("Is it Sunday?");
        }

    }

    public static void main (String...args){
        ImplementingQuestion2Test1 imp = new ImplementingQuestion2Test1();
        imp.printDay(Question2Test1.MONDAY);
    }
}
