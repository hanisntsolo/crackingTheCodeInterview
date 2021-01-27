package dhirendra.dsadeepdiveintojava.sortalgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] intArray = {2,4,5,134,31,23,23,43};
        for(int i=0;i<intArray.length-1;i++) {
            for(int j=i;j<intArray.length-1;j++) {
                if(intArray[i]>intArray[i+1])
                    swap(intArray, j,j+1);
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
    public static void swap(int [] arr, int i, int j) {
        int temp;
        if(i == j) {
            return;
        } else {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
