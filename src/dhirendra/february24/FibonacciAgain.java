

import java.util.Scanner;

public class FibonacciAgain {
  private static long pissanoPeriod(long m) {
    long prev =0;
    long curr =1;
    long res =0;
    for(int i=0;i< m*m;i++) {
      long temp = curr;
      curr = (curr+prev) % m;
      prev = temp;
      if(prev == 0 && curr == 1)
        res = i + 1;
    }
    return res;
  }
  private static long gettingRemainder(long n, long res) {
    long pissanoPeriod = pissanoPeriod(res);
    n = n % pissanoPeriod;
    if(n<=1) {
      return n;
    }
    long prev =0;
    long curr =1;
    for(long i=0;i<n-1;i++) {
      long temp=0;
      temp = curr;
      curr = (prev+curr)% res;
      prev = temp;
    }
    return curr;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long num = in.nextLong();
    long div = in.nextLong();
    long result = gettingRemainder(num, div);
    System.out.println(result);
  }
}
