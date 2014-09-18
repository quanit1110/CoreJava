package SCJPTutorial;

/**
 * Created by mitalcs on 9/17/14.
 */
public abstract class AbstractDemo {
    /* If any class has an abstract method in it. It must be declare as abstract class only.
    That means abstract method cannot be declare in non -abstract class because when we create an object of an class
     JVM will not interpret an abstract method as it has no implementation and will create ambiguity.
     So when we create an abstract class, we cannot create an object of an abstract class.
    But an abstract class can contain non - abstract method in it. Although it is not recommended but it is valid
    from syntax point of view.
    */
    public abstract double getTotalSurfaceArea();

   //Declaring non - abstract method in an abstract class.
    public void printMe (){

    }

}


class ExtendedAbstract extends AbstractDemo{
    /* Benefit of an abstract method : When an abstract method is not implemented in an inherited class
    it will throw error syntax error. So now we know that these method is yet to be implemented from parent class.

     */

    @Override
    public double getTotalSurfaceArea() {
        return 900;
    }
}


abstract class AnotherAbstract extends AbstractDemo{
    /* An abstract class don't need to implement an abstract method of it parent class
    So here if we don't implement an abstract method of getTotalSurfaceArea() it will not throw error.
    Note the difference here between AnotherAbstract class and ExtendedAbstract class.
    In ExtendedAbstract class, this method is to be implemented as it was non abstract class. Else will throw error
    Here in this class, its okay if not implemented that method.
     */
}