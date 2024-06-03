package Exception_Handling.unchecked_exception;

public class Out_of_Memory_Error {

    public static void main(String[] args) {
        try {
            int[] array = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error: " + e.getMessage());
        }
    }
}
