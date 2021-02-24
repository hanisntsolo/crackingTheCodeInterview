package dhirendra.february24;

import java.util.Scanner;

public class Fibonacci {
  private static long uniqueLargeFib(long number) {
    int arr[] = new int[(int)number+1];
    if(number<=1) {
      return number%10;
    }
    arr[0] = 0;
    arr[1] = 1;
    for(int i=2;i<=number;i++) {
      arr[i] = (arr[i-1] +arr[i-2]);
    }
    return arr[arr.length-1];
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long num = in.nextInt();
    long result = uniqueLargeFib(num);
    System.out.println(result);
  }
}
