package dhirendra.february03;

import java.util.Arrays;
//Very important question with respect to arrays
public class PrintArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,6,7,8,9};
        int[][] arr1 = new int[][]{{1,2},{1,2,3,4,5},{2,3,4}};
        for(int item:arr){
            System.out.println(item);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr1));
    }
}
