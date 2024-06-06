package Strings;

public class String_to_Char_Array {
    public static void main(String[] args) {

        String s = "#@#^&HJWDGKK@&*#7483";
        char[] arr = new char[s.length()];
        for(int i=0; i<=s.length()-1; i++){
            arr[i]=s.charAt(i);
        }
        System.out.println("Character Array:");
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
