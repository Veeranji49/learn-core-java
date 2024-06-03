package MultiDimensional_Arrays;

public class Printing_elements_using_input {

    public static void main(String[] args) {

        int[][] arr= {{1,2,3,3},{2,4,2,6,2},{3,6,3,4,2,3}};

        for(int row=0; row<=arr.length-1; row++){
            for(int col=0; col<=arr[row].length-1; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println(arr.length);//length of the array elements
    }
}
