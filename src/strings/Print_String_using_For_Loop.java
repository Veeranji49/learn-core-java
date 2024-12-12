package strings;

public class Print_String_using_For_Loop {
    public static void main(String[] args) {
        String s = "J Veeranji, working as a java developer";

        for (char index = 0; index <= s.length() - 1; index++) {
            System.out.print(s.charAt(index));
        }
    }
}
