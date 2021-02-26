package dhirendra.february26;

import java.util.Scanner;

//Incomplete code not passing the test cases
public class SumofPrimes {
  private static boolean isPrime(long n) {
    if(n<=1)
      return false;
    for(int i=2;i<=Math.floor(Math.sqrt(n));i++) {
      if(n%i == 0)
        return false;
    }
    return true;
  }
  private static long primeSum(long number) {
    long sum=2;
    for(int i=3;i<=number;i+=2) {
      if(isPrime(i))
        sum+=i;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
      long n = in.nextInt();
      long result = primeSum(n);
      System.out.println(result);
    }
  }
}
