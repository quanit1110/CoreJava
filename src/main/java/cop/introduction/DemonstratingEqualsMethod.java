package cop.introduction;

/**
 * Created by Mital Jani on 11/3/14.
 * Demonstrating the equals method
 */
public class DemonstratingEqualsMethod {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof DemonstratingEqualsMethod)) return false;

        DemonstratingEqualsMethod demonstratingEqualsMethod = (DemonstratingEqualsMethod) o;

        if (id != demonstratingEqualsMethod.id) return false;

        return true;
    }

    public static void main(String... args){
        DemonstratingEqualsMethod s1 = new DemonstratingEqualsMethod();
        s1.setId(1);
        s1.setName("Mital");
        DemonstratingEqualsMethod s2 = new DemonstratingEqualsMethod();
        s2.setId(1);
        s2.setName("Hardik");

        System.out.println("s1.equals(s1):"+ s1.equals(s1)); //true
        System.out.println("s1.equals(s1):"+ s1.equals(null)); //false
        System.out.println("s1.equals(s2):"+ s1.equals(s2)); //true

    }
}
