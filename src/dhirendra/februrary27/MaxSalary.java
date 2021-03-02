package dhirendra.februrary27;

import java.util.Arrays;
import java.util.Scanner;
public class MaxSalary {
  private static String maxSalary(long digits, long[] arr) {
    Arrays.sort(arr);
    String str = "";
    for(int i=(int)digits-1;i>=0;i--) {
      str += String.valueOf(arr[i]);
    }
    return str;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long digits = sc.nextLong();sc.nextLine();
    long arr[] = new long[(int) digits];
    for(int i = 0;i< digits;i++) {
      arr[i] = sc.nextLong();
    }
    String result = maxSalary(digits,arr);
    System.out.println(result);
  }
}
