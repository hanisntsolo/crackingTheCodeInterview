package dhirendra.february21;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaxPairWiseProduct {
//    private static long maxPairImproved() {
//        long
//    }
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
    public static void main(String[] args) {
        stressTesting();
//        Scanner sc = new Scanner(System.in);
//        long num = sc.nextInt();sc.nextLine();
//        long[] arr = new long[(int)num];
//        for(long i=0;i<num;i++) {
//            arr[(int) i] = sc.nextLong();
//        }
//        long result = maxPair(arr);
//        System.out.println(result);
    }
    private static void stressTesting(){
        while(true) {
            Random random = new Random();
            long num = Math.abs((int)random.nextLong()%10+2);
            long[] arr = new long[(int)num];
            for(long i=0;i<num;i++) {
                arr[(int)i] = Math.abs(random.nextLong()%10);
            }
            long result2 = maxPair(arr);
            Arrays.sort(arr);
            long result =0;
            if(arr.length == 0 || arr.length == 1) {
                result =  0;
            }
            if(arr.length>1)
            result = arr[arr.length-1]*arr[arr.length-2];
            if(result2!=Math.abs(result)) {
                System.out.println("TEST BROKE"+" AT"+result);
                for(long num1:arr) {
                    System.out.print(num1+" ");
                }
                break;
            } else {
                System.out.println("OK! PASSED");
                System.out.println("With result"+result);
            }
        }
    }
}
