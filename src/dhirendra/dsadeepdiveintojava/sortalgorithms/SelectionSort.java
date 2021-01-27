package dhirendra.dsadeepdiveintojava.sortalgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] intArray = {2,4,5,134,31,23,23,43,56};
        for(int lastSortedIndex=intArray.length-1;lastSortedIndex>0;lastSortedIndex--) {
            int largest = 0;
            for(int i=0;i<=lastSortedIndex;i++) {
                if(intArray[i]>intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray,largest,lastSortedIndex);
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
