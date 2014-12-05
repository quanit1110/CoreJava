package cop.introduction;

/**
 * Created by mitalcs on 11/20/14.
 */
/*
Demonstrating the concept of Enum Class and its implementation
 */
public final class FirstClas {
    private String solarname;

    private FirstClas(String str) {
        solarname = str;
    }

    public static final FirstClas EARTH = new FirstClas("EARTH");
    public static final FirstClas MERCURY = new FirstClas("MERCURY");
    static final FirstClas VENUS = new FirstClas("VENUS");
    public static FirstClas PLUTO = new FirstClas("PLUTO");


    public String toString() {
        return solarname;
    }
}


