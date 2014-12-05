package cop.scjp.oracle.tutorial;

/**
 * Created by mitalcs on 11/26/14.
 */
public class InheritingExplainingInheritanceConcept extends ExplainingInheritanceConcept {

    public InheritingExplainingInheritanceConcept(){
        super("Hello");
        System.out.println("Damn I am also created");
    }

    public void hh(){
        someMethod();
        System.out.println ("Ha Ha Ha I am finally overridden");

    }
    public static void main (String... args){
      //  ExplainingInheritanceConcept superClass = new ExplainingInheritanceConcept();
        InheritingExplainingInheritanceConcept subClass = new InheritingExplainingInheritanceConcept();

        //superClass.someMethod();
       subClass.someMethod();
    }
}
