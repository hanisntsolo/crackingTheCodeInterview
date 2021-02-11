package dhirendra.february12;

import java.util.Arrays;
import java.util.Scanner;
class GFG {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();sc.nextLine();
    for(int i=0;i<times;i++) {
      int length = sc.nextInt();
      int[] arr = new int[length];
      for(int j=0;j<length;j++) {
        arr[j] = sc.nextInt();
      }
      int[] finalArray = convertToWave(arr, length);
      for(int item:finalArray) {
        System.out.print(item+" ");
      }
    }
  }
  static void swap(int arr[], int a, int b)
  {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
  public static int[] convertToWave(int arr[], int n){
    Arrays.sort(arr);

    // Swap adjacent elements
    for (int i=0; i<n-1; i += 2)
      swap(arr, i, i+1);
    return arr;
  }
}
//class GFG {
//  public static void main (String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int times = sc.nextInt();sc.nextLine();
//    for(int i=0;i<times;i++) {
//      int length = sc.nextInt();
//      int[] arr = new int[length];
//      for(int j=0;j<length;j++) {
//        arr[j] = sc.nextInt();
//      }
//      int[] finalArray = convertToWave(arr, length);
//      sc.nextLine();
//      for(int item:finalArray) {
//        System.out.print(item+" ");
//      }
//    }
//  }
//  public static int[] convertToWave(int arr[], int n){
//    for(int i=0; i< n ; i = i+2){
//
//      if(i>0 && arr[i-1]>arr[i]){
//        int temp = arr[i-1];
//        arr[i-1]= arr[i];
//        arr[i] = temp;
//      }
//      if(i<n-1 && arr[i]<arr[i+1]){
//        int temp = arr[i+1];
//        arr[i+1]= arr[i];
//        arr[i] = temp;
//      }
//    }
//    return arr;
//  }
//}