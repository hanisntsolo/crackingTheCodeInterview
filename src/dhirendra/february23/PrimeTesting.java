package dhirendra.february23;

import java.util.Random;

public class PrimeTesting {
    private static boolean isPrime(long number) {
        boolean flag=true;
        for(long i=2;i<=number/2;i++) {
            if(number%i == 0) {
                flag=false;
                return flag;
            }
        }
        return flag;
    }
    //code within time bounds
    private static long largestPrimeBestApproach(long number) {
        long div =2;
        while(div<=Math.floor(Math.sqrt(number))) {
            if(number%div == 0) {
                number/=div;
            } else {
                div++;
            }
        }
        return number;
    }
    private static long largestPrime(long number) {
        long maxPrime=0;
        long currentPrime=0;
        for(int i=2;i<=number;i++) {
            if(isPrime(i)) {
                currentPrime = i;
                if(currentPrime>maxPrime && number%currentPrime == 0) {
                    maxPrime = currentPrime;
                }
            }
        }
        return maxPrime;
    }

    public static void main(String[] args) {
        Random in = new Random();
        while(true) {
//            long input = Math.abs(in.nextLong()%100+2);
            long largest = largestPrimeBestApproach(20);
            System.out.println(largest);
        }

    }
}
