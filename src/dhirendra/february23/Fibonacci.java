package dhirendra.february23;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Fibonacci {
    public static long getSum(long n){
        long a=2;
        long b=3;
        long c;
        long sum=0;
        while(a<=n){
            if(a%2==0) sum+=a;
            c=a+b;
            a=b;
            b=c;
        }
        return sum;
    }
    private static long fibonacci(long number) {
        long result=0;
        int[] arr = new int[(int)number];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<number;i++) {
            arr[i] = arr[i-1] = arr[i-2];
            if(arr[i]%2==0)
                result+=arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        while (true) {
            Random in = new Random();
            long t = in.nextLong();
            for (int a0 = 0; a0 < t; a0++) {
                long n = in.nextLong() % 1000000000 + 10;
                n=Math.abs(n);
                long result = getSum(n);
                System.out.println(result);
            }
        }
    }
}
