package OOPs.OOps_Intro.Wrapper_Classes;

public class WrapperDemo2 {

    public static void main(String[] args) {

        // Auto-boxing: Converting primitive to wrapper object
        Integer intObj = 100; // equivalent to Integer intObj = Integer.valueOf(100);
        Double doubleObj = 55.75; // equivalent to Double doubleObj = Double.valueOf(55.75);
        Character charObj = 'A'; // equivalent to Character charObj = Character.valueOf('A');
        Boolean boolObj = true; // equivalent to Boolean boolObj = Boolean.valueOf(true);

        // Printing wrapper objects
        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);

        // Unboxing: Converting wrapper object back to primitive
        int intValue = intObj; // equivalent to int intValue = intObj.intValue();
        double doubleValue = doubleObj; // equivalent to double doubleValue = doubleObj.doubleValue();
        char charValue = charObj; // equivalent to char charValue = charObj.charValue();
        boolean boolValue = boolObj; // equivalent to boolean boolValue = boolObj.booleanValue();

        // Printing primitive values
        System.out.println("Primitive int: " + intValue);
        System.out.println("Primitive double: " + doubleValue);
        System.out.println("Primitive char: " + charValue);
        System.out.println("Primitive boolean: " + boolValue);

        // Using wrapper class methods
        System.out.println("Max value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Min value of Integer: " + Integer.MIN_VALUE);
        System.out.println("Binary representation of 100: " + Integer.toBinaryString(intValue));
    }
}