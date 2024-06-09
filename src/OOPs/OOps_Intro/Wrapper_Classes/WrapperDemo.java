package OOPs.OOps_Intro.Wrapper_Classes;

public class WrapperDemo {

    public static void main(String[] args) {

        // Using wrapper classes
        Integer intObj = Integer.valueOf(10);
        Double doubleObj = Double.valueOf(15.5);

        // Converting back to primitive types
        int intValue = intObj.intValue();
        double doubleValue = doubleObj.doubleValue();

        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Primitive int: " + intValue);
        System.out.println("Primitive double: " + doubleValue);
    }
}