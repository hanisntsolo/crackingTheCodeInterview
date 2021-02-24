package dhirendra.february24;

import java.util.Scanner;

public class FibonacciSum {
  private static long uniqueLargeFib(long number) {
    int arr[] = new int[(int)number+1];
    long sum=0;
    if(number<=1) {
      sum+=number;
      return sum;
    }
    arr[0] = 0;
    arr[1] = 1;
    for(int i=2;i<=number;i++) {
      arr[i] = (arr[i-1] +arr[i-2])%10;
      sum+=arr[i];
    }
    return sum%10;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long num = in.nextLong();
//    long div = in.nextLong();
    long result = uniqueLargeFib(num);
    System.out.println(result);
  }
}
