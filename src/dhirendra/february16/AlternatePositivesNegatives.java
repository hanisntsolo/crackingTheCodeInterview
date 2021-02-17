package dhirendra.february16;

import java.util.Scanner;
//Given an unsorted array of positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
//
//    Input:
//    First line of input contains an integer T denoting the number of test cases. For each testcase, first line contains N, size of array. The subsequent line contains N array elements.
//
//    Output:
//    Print the modified array.
//    Note: Array should start with positive number.
//
//    Constraints:
//    1 ≤ T ≤ 100
//    1 ≤ N ≤ 107
//    -106 ≤ a[] ≤ 107
//
//    Example:
//    Input:
//    2
//    9
//    9 4 -2 -1 5 0 -5 -3 2
//    5
//    1 2 3 4 5
//
//    Output:
//    9 -2 4 -1 5 -5 0 -3 2
//    1 2 3 4 5
class AlternatePositivesNegatives {
  private static int[] positiveArray(int[] arr) {
    //to count positives
    int positives=0;
    for(int number:arr) {
      if(number>=0)
        positives++;
    }
    int[] positiveArr = new int[positives];
    int pos=0;
    for(int i =0;i<arr.length-1;i++) {
      if(arr[i]>=0) {
        positiveArr[pos++] = arr[i];
        // pos++;
      }
    }
    //to seperate positives
    return positiveArr;
  }
  private static int[] negativeArray(int [] arr) {
    //to count negatives
    int negatives=0;
    for(int number:arr) {
      if(number>0)
        negatives++;
    }
    int[] negativeArr = new int[negatives];
    int pos=0;
    for(int i =0;i<arr.length-1;i++) {
      if(arr[i]<0) {
        negativeArr[pos++] = arr[i];
        // pos++;
      }
    }
    //to seperate positives
    return negativeArr;
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int tests = sc.nextInt();sc.nextLine();
    for(int k=0;k<tests;k++) {
      int length = sc.nextInt();
      int[] arr = new int[length];
      for(int i=0;i<length-1;i++) {
        arr[i] = sc.nextInt();
      }
      int[] positive = positiveArray(arr);
      int[] negative = negativeArray(arr);
      for(int j=0;j<arr.length;j++) {
        if(negative.length == 0) {
          System.out.print(positive[j]+" ");
        }
        if(positive.length == 0) {
          System.out.print(negative[j]+" ");
        }
        else {
          System.out.print(positive[j]+" "+negative[j]);
        }

      }
    }
  }
}