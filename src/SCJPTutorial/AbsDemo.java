package SCJPTutorial;


abstract class AbsCar{

    // Abstract class can have abstract method as well as concrete method/ non abstract method.
    //if class have abstract method in it then it must be declare as abstract class
    //try out removing abstract from above and it will throw error

    public abstract double getTotalSurfaceArea();
    public double getTotalMatrix(){
        return 0;
    }

}

// We can declare any non abstract method of parent class as abstract method in its subclass while inheriting.
// Here I am inheriting Method of AbsCar getTotalMetrix() and declare as abstract.

  abstract class AbsCar1 extends AbsCar{
    public abstract double getTotalMatrix();
    public abstract void absCar1Meth();
    public abstract void concreteMeth();
}
//
//So now, here I create sub-class of AbsCar1 and try to implement all abstract method.
//Note that at this point of inheritance chain getTotalMatrix() is an abstract and it needs to implemented alongwith other abstract methods.
//But if getTotalMatrix has already been implemented in some other class before creating this subclass
//It does not need to implement here

public class AbsDemo extends AbsCar1 {
    @Override
    public double getTotalMatrix() {
        return 900;
    }

    @Override
    public double getTotalSurfaceArea() {
        return 500;
    }

    @Override
    public void absCar1Meth() {
        System.out.println ("Here you go");

    }

    @Override
    public void concreteMeth() {
        System.out.println("Hey there");

    }
}




