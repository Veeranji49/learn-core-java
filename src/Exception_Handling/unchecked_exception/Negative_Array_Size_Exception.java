package Exception_Handling.unchecked_exception;

public class Negative_Array_Size_Exception {

    public static void main(String[] args) {
        try {
            int[] array = new int[-5]; // NegativeArraySizeException
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
