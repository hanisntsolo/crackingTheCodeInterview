package dhirendra.february15;

import java.util.Arrays;
import java.util.Scanner;

class RepeatingElement {
  private static int searchIndex(int[] array) {
    for(int i=0;i<array.length-1;i++) {
      if(array[i] == array[i+1]) {
        return i+1;
      }
    }
    return -1;
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int tests = sc.nextInt();sc.nextLine();
    for (int i=0;i<tests;i++) {
      int length = sc.nextInt();
      int[] arr = new int[length];
      for(int j=0;j<length;j++) {
        arr[j] = sc.nextInt();
      }
      Arrays.sort(arr);
      int index = searchIndex(arr);
      System.out.println(index);
    }
  }
}