package dhirendra.february02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class NextPermutation {
    public static void calculatePermutation(int[] number) {

        int temp;
        int result=0;
        int n = number.length;
        for(int k=n;k>0;k--) {
            result+= number[k-1]*Math.pow(10,n-k);
        }
        Arrays.sort(number);
        for(int i=1;i<=n;i++) {  //
            for(int j=0;j<n-1;j++) {
                temp = number[j];
                number[j] = number[j+1];
                number[j+1] = temp;
                System.out.println(Arrays.toString(number));
                int finalResult=0;
                for(int k=n;k>0;k--) {
                    finalResult+= number[k-1]*Math.pow(10,n-k);
                }
                if(finalResult>result){
                    System.out.println(Arrays.toString(number));
                    break;
                }
            }
        }
    }   //Final code from here
        public static void swap(int[] array, int a, int b) {
            int temp;
            temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
        public static void nextPermute(int[] array) { // 1 2 5 4 1
            int first = array.length-1;
            while(first>=1 && array[first-1] >= array[first]) {
                first--;
            }
            if(first == 0) {
                Arrays.sort(array);
                return;
            }
            first--;
            int second = array.length-1;
            while(first<second && array[first]>=array[second]) {
                second--;
            }
            swap(array, first,second);
            int start = first+1;
            int end = array.length-1;
            while(start<end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                end--;
                start++;
            }
        }

    public static void main(String[] args) {
        int[] array = {1,2,5,4,1};
//        calculatePermutation(array);
        nextPermute(array);
    }
}
