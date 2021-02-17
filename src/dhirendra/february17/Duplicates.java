package dhirendra.february17;

import java.util.Scanner;

class Duplicates {
  public static int removeDuplicateElements(int arr[], int n){
    if (n==0 || n==1){
      return n;
    }
    int j = 0;//for next element
    for (int i=0; i < n-1; i++){
      if (arr[i] != arr[i+1]){
        arr[j++] = arr[i];
      }
    }
    arr[j++] = arr[n-1];
    return j;
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();sc.nextLine();
    for(int k=0;k<test;k++) {
      int length = sc.nextInt();sc.nextLine();
      int[] arr = new int[length];
      for(int j=0;j<length-1;j++) {
        arr[j] = sc.nextInt();
        //set.add(sc.nextInt());
      }
      length = removeDuplicateElements(arr, length);
      //printing array elements
      for (int i=0; i<length; i++)
        System.out.print(arr[i]+" ");
    }

    //  for(int num:set) {
    //      System.out.print(num+" ");
    //  }
  }
}
