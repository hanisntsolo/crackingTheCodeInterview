package dhirendra.february13;


import java.util.*;
import java.lang.*;
import java.io.*;

class KRotation {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);//code
    int tests = sc.nextInt();sc.nextLine();
    for(int i=0;i<tests;i++) {
      int length = sc.nextInt();sc.nextLine();
      int[] arr = new int[length];
      int[] unsortedArr = new int[length];
      for(int j=0;j<length;j++) {
        arr[j] = sc.nextInt();
        unsortedArr[j] = arr[j];
      }
      Arrays.sort(arr);
      int found=0;
      for(int k=0;k<length;k++) {
        if(arr[0] == unsortedArr[0]) {
          found=0;
          break;
        }
        if(arr[0] == unsortedArr[k]) {
          found = k;
          break;
        }
      }
      System.out.println(found);
    }
  }
}
