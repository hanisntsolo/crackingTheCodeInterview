

import java.util.Scanner;
public class SmallestMultiple {

    private static long hcf(long a, long b) {
      if(a == 0) {
        return b;
      }
      return hcf(b%a, a);
    }
  private static long lcm(long n)
  {
    long ans = 1;
    for (long i = 1; i <= n; i++)
      ans = (ans * i)/(hcf(ans, i));
    return ans;
  }
  private static long multipleHcf(long[] arr) {
      long result = arr[0];
      for(long i=0;i<arr.length-1;i++) {
        result = hcf(arr[(int)i+1], result);
      }
      return result;
    }
    private static long productCalculator(long [] arr) {
      long result=1;
      for(long l:arr) {
        result = result * l;
      }
      return result;
    }
    private static long[] arrayMaker(long number) {
      long[] arr = new long[(int)number];
      for(long i=0;i<number;i++) {
        arr[(int)i] = i+1;
      }
      return arr;
    }
    private static long smallestMultiple(long prod, long hcf) {
      return prod/hcf;
    }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long test = in.nextLong();in.nextLine();
    for(long i=0;i<test;i++) {
      long number = in.nextLong();
      long[] arr = arrayMaker(number);
      long hcf = multipleHcf(arr);
      long prod = productCalculator(arr);
      long result = smallestMultiple(prod,hcf);
      long lcm = lcm(number);
      System.out.println(lcm);
    }
  }
}
