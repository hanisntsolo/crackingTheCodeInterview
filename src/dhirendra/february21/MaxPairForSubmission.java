package dhirendra.february21;

import java.util.Arrays;
import java.util.Scanner;

public class MaxPairForSubmission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        long[] arr = new long[length];
        for(int i=0;i<length;i++) {
            arr[(int)i] = sc.nextLong();
        }
        long result = maxPair(arr);
        System.out.println(result);
    }
    private static long maxPair(long[] arr) {
        long result=0;
        Arrays.sort(arr);
        if(arr.length == 0 || arr.length == 1) {
            return 0;
        }
        if(arr.length>1)
            result = arr[arr.length-1]*arr[arr.length-2];
        return Math.abs(result);
    }
}
