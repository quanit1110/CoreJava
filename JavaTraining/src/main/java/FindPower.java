/**
 * Created by mitalcs on 10/10/14.
 */
public class FindPower {
    public static void main (String ... args){
        FindPower fp = new FindPower();
       // fp.returnPower();
      //  fp.returnPowerOf2();
        fp.returnPowerEffective();
    }
    public void returnPower () {
        for (int i = 1; i < 10; i++) {
            System.out.print((int) Math.pow(1, i));
            System.out.print("\t");
        }
    }

    public void returnPowerOf2() {
        for (int i = 1; i < 10; i++) {
            System.out.print ("\t");
            System.out.print((int) Math.pow(2, i));
            System.out.print("\t");
        }
    }

    public void returnPowerEffective (){
     for (int n = 1; n <=10; n++){
         for (int i = 1; i<=10; i++){
             System.out.print((int) Math.pow(n,i));
             System.out.print ("\t");
         }
     }
     }

}


