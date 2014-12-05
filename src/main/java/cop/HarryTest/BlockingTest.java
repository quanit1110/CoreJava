package cop.HarryTest;

/**
 * Created by mitalcs on 12/1/14.
 */
public class BlockingTest {

    {
        System.out.println("Me First");
    }

    public BlockingTest() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Me Second");
    }


    public static void main(String... args) {
        new BlockingTest();
    }
}

