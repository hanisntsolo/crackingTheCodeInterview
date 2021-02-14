package dhirendra.february14;

import java.util.Vector;

public class MaxSubArray {

  public static void main(String[] args) {
    System.out.println(findSubarray(new int[] {-1,2},2));
  }
  static Vector<Integer> findSubarray(int a[], int n) {
    int best_sum = 0;
    int best_start = 0;
    int best_end = 0;
    int current_sum = 0;
    int current_start = 0;
    for(int i=0;i<a.length;i++) {
      if(current_sum<0) {
        //Start a new sequence at the current element
        current_start = a[i];
        current_sum = a[i];
      } else {
        current_sum += a[i];
      }
      if(current_sum > best_sum) {
        best_sum = current_sum;
        best_start = current_start;
        best_end = a[i]+1;
      }
    }
    Vector<Integer> arr = new Vector<>();
    for(int k=best_start;k<best_end-1;k++) {
      arr.add(a[k]);
    }
    return arr;
  }
}
