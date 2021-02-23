package dhirendra.february13;


import java.util.Arrays;
import java.util.Scanner;

class SecondSmallest {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);//code
    int tests = sc.nextInt();sc.nextLine();
    for(int i=0;i<tests;i++) {
      int length = sc.nextInt();sc.nextLine();
      int[] arr = new int[length];
      for(int j=0;j<length;j++) {
        arr[j] = sc.nextInt();
      }
      Arrays.sort(arr);
      System.out.println(arr[1]);
    }
  }
}
