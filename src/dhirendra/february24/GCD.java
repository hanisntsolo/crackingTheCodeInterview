package dhirendra.february24;

import java.util.Scanner;

public class GCD {
  private static long gcd(long a, long b) {
    if(a == 0) {
      return b;
    }
    return gcd(b%a, a);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long num1 = in.nextInt();
    long num2 = in.nextInt();
    long result = gcd(num1,num2);
    System.out.println( result );
  }
}
