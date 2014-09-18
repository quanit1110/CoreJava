package SCJPTutorial;

/**
 * Created by mitalcs on 9/18/14.
 */
public abstract class AbstractModifierQuiz {
    // Which methods class C must implement?
    //My answer is method m1() and m4()

    public abstract void m1();

    private void m2(){
        System.out.println ("In m2");
    }

    public abstract void m3();

    public void m4(){
        System.out.println ("In m4");
    }

    abstract class B extends AbstractModifierQuiz{

        public abstract void m4();

        public void m3(){
            System.out.println ("Inside m3");
        }
        public void m5(){
            System.out.println ("Inside m5");
        }
    }


    //Here is answer
    class C extends B{
        @Override
        public void m1() {

        }

        @Override
        public void m4() {

        }
    }
}
