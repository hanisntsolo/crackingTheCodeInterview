package dhirendra.february22;

import java.util.Random;
import java.util.Scanner;

public class Multipleof3and5 {
    private static long sum3and5(long number) {
        long result=0;
        if(number == 0) return 0;
        if(number == 1)
            return 1;
        if(number == 2) {
            return 2;
        }
        if(number == 3) {
            return 3;
        }
        for(int i=3;i<number;i++) {
            if(i%3==0||i%5==0) {
                result +=i;
            }
        }
        return result;
    }
    private static long sumMultiplesThreeAndFive(long upperBound) {
        long sum3 = 0;
        long sum5 = 0;
        long sum15= 0;
        if(upperBound == 1)
            return 0;
        if(upperBound == 2) {
            return 0;
        }
        if(upperBound == 3) {
            return 0;
        }
        long num3 = upperBound/3;
        long num5 = upperBound/5;
        long num15 = upperBound/15;
        if(upperBound%5==0)
            num5-=1;
        if(upperBound%3==0)
            num3-=1;
        if(upperBound%15==0)
            num15-=1;
        sum3 = 3 * (((num3*(num3+1))/2));
        sum5 = 5 * (((num5*(num5+1))/2));
        sum15 = 15 * (((num15*(num15+1))/2));
        return sum3+sum5-sum15;
    }
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        while (true) {
            Random in = new Random();
//            int t = in.nextInt() % 5 + 2;
//            for (int a0 = 0; a0 < Math.abs(t); a0++) {
                long n = Math.abs(in.nextInt() % 5+1);
                long result = sumMultiplesThreeAndFive(n);
                long result1 = sum3and5(n);
                if (result != result1) {
                    System.out.println("Code broke at " + n);
                    break;
                } else {
                    System.out.println(result);
                    System.out.println(result1);
                }

//            }
        }
    }
}
