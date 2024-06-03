package Exception_Handling.unchecked_exception;

public class String_index_out_of_Bounds {

    public static void main(String[] args) {

        String str = "hello";
        char ch = str.charAt(10); // StringIndexOutOfBoundsException
        System.out.println("Character: " + ch);
    }
}
