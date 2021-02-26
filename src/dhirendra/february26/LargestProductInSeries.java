package dhirendra.february26;

import java.util.Scanner;

public class LargestProductInSeries {

  private static long maxProduct(String str, int n, int k) {
    long length = str.length();
    long arrayLength = n - k;
    long j= k;
    long max=0;
    long[] arr = new long[(int)arrayLength];
    for(int i=0;i<arrayLength;i++) {
      arr[i] = product(str.substring((int)i,(int)j));
      if(arr[i]>max)
        max = arr[i];
      j++;
    }
    return max;
  }
  private static long product(String str) {
    long prod = 1;
    for(int i=0;i<str.length();i++) {
      prod = prod * Integer.parseInt(String.valueOf(str.charAt(i)));
    }
    return prod;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
      int n = in.nextInt();
      int k = in.nextInt();
      String num = in.next();
      long result = maxProduct(num, n ,k);
      System.out.println(result);
    }
  }
}
