package dhirendra.february24;

import java.util.Scanner;

public class LeastCommonMultiple {
  private static long gcd(long a, long b) {
    if(a == 0) {
      return b;
    }
    return gcd(b%a, a);
  }
  private static long lcm(long product, long gcd) {
    return product/gcd;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long num1 = in.nextInt();
    long num2 = in.nextInt();
    long result = gcd(num1,num2);
    long resultFinal = lcm(num1 * num2,result);
    System.out.println( resultFinal );
  }
}
