package dhirendra.february25;

import java.util.Scanner;
//HCF multiple are working
public class HcfMultiple {
  private static long hcf(long a, long b) {
    if(a == 0) {
      return b;
    }
    return hcf(b%a, a);
  }

  private static long multipleHcf(long[] arr) {
    long result = arr[0];
    for(long i=0;i<arr.length-1;i++) {
      result = hcf(arr[(int)i+1], result);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long tests = in.nextLong();in.nextLine();
    for(long i=0;i<tests;i++) {
      long length = in.nextLong();in.nextLine();
      long[] arr = new long[(int)length];
      for(long j=0;j<length;j++) {
        arr[(int)j] = in.nextLong();
      }
      long result = multipleHcf(arr);
      System.out.println("The hcf is: "+result);
    }
  }
}
