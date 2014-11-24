import java.util.Random;

/**
 * Created by mitalcs on 10/10/14.
 */
public class RandomNumber {
    Random randGen = new Random ();
    public void generateRandom (){
        for (int i = 0; i <= 100; i++){
     //   int var = randGen.nextInt(100);
        System.out.println (randGen.nextInt(100));
        }
    }

    public static void main (String ... args){
        RandomNumber rn = new RandomNumber();
        rn.generateRandom();
    }


}
