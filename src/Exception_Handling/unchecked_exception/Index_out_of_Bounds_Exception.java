package Exception_Handling.unchecked_exception;

public class Index_out_of_Bounds_Exception {

    public static void main(String[] args) {

        String[] names = {"John", "Doe"};
        String lastName = names[2]; // IndexOutOfBoundsException
        System.out.println("Last Name: " + lastName);
    }
}
