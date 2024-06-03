package Exception_Handling.unchecked_exception;

public class Number_Format_Exception {

    public static void main(String[] args) {

        String str = "abc";
        int num = Integer.parseInt(str); // NumberFormatException
        System.out.println("Number: " + num);
    }
}
