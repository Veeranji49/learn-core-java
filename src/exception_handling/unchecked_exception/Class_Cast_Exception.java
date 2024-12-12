package exception_handling.unchecked_exception;

public class Class_Cast_Exception {

    public static void main(String[] args) {

        Object obj = new Integer(10);
        String str = (String) obj; // ClassCastException
        System.out.println("String: " + str);
    }
}
