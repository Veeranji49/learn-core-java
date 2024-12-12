package dsa.Searching.Linear_Search;

public class Return_true_or_false_of_element {

    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7,8,9};
        int target = 9;
        boolean ans = linearSearch(arr,target);
        System.out.println(ans);
    }

    static  boolean linearSearch(int[] arr, int target){
        if(arr.length==0){
            return false;
        }

        for(int index =0; index<= arr.length-1; index++){
            int element = arr[index];
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
