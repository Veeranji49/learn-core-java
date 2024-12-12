package strings;

public class ASCII_values_of_a_String {

    public static void main(String[] args) {

        String str = "Jilakara Veeranji";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            System.out.println("Character: " + ch + " ASCII: " + ascii);
        }

    }
}
