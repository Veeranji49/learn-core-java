package Strings;

public class Split_Method {
    public static void main(String[] args) {

        String s="Family is Everything";

        //ignoring spaces
        String[] arr=s.split(" ");
        for(String x:arr)
        {
            for(int i=0; i<=x.length()-1; i++)
            {
                System.out.print(x.charAt(i));
            }

        }
    }
}
