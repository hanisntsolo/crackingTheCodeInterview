package dhirendra.february12;
//Given a sorted array arr[] of non-repeating integers without duplicates. Sort the array into a wave-like array and return it. In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).
//
//    Input:
//    The first line contains an integer T, depicting total number of test cases. T testcases follow. The first line of each testcase contains an integer N depicting the size of the array. The second line contains N space separated elements of the array.
//
//    Output:
//    For each testcase, in a new line, print the array into wave-like array.
//
//    Constraints:
//    1 ≤ T ≤ 100
//    1 ≤ N ≤ 106
//    0 ≤ A[i] ≤107
//
//    Example:
//    Input:
//    2
//    5
//    1 2 3 4 5
//    6
//    2 4 5 10 11 13
//    Output:
//
//    2 1 4 3 5
//    4 2 10 5 13 11
//
//    Explanation:
//    Testcase 1: Array elements after sorting it in wave form are 2 1 4 3 5.
//
//    TestCase 2: Array elements after sorting it in wave form are 4 2 10 5 13 11
import java.util.Arrays;
import java.util.Scanner;
public class WaveArray {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalTests = sc.nextInt();sc.nextLine();
    for(int i=0;i<totalTests;i++) {
      int number = sc.nextInt();sc.nextLine();
      String str = sc.nextLine();
      String[] chars = str.split( " ");
      int k = 0;
      int l = 1;
      for(int j=0;j<chars.length-1;j++) {
        if(k<chars.length-2 && l<chars.length-1) {
          String temp = chars[k];
          chars[k] = chars[l];
          chars[l] = temp;
          k+=2;
          l+=2;
        }
      }
//      System.out.println(Arrays.toString(chars));
      for(String str1: chars) {
        System.out.print(str1+" ");
      }
      System.out.println();
    }
  }
}
