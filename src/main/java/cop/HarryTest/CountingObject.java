package cop.HarryTest;

/**
 * Created by mitalcs on 12/1/14.
 */
public class CountingObject {
    private static int count;
    public CountingObject(){
         count++;
    }
    public int getCount(){
        return count;
    }

    public static void main (String...args){
        CountingObject co = new CountingObject();
        System.out.println (co.getCount());
        CountingObject co1 = new CountingObject();
        System.out.println (co1.getCount());

    }
}
