package strings;

public class String_of_Array_in_Reverse {

    public static void main(String[] args) {

        String[] arr = {"anji", "veeru", "veeranji", "amma", "nanna"};

        for (int i = 0; i <= arr.length - 1; i++) {
            String s = arr[i];
            for (int j = 0; j <= s.length() - 1; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
