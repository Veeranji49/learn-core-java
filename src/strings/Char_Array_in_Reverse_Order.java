package strings;

public class Char_Array_in_Reverse_Order {

    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'd', 'r', 'o'};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("Reverse :" + arr[i]);
        }
    }
}
