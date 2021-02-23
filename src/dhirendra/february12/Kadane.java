package dhirendra.february12;

public class Kadane{

  // Function to find subarray with maximum sum
  // arr: input array
  // n: size of array
  int maxSubarraySum(int arr[], int n){

    int currentStreak = 0;
    int globalStreak = arr[0];
    for(int i=0;i<n;i++) {
      currentStreak = java.lang.Math.max(arr[i], currentStreak+arr[i]);
      if(currentStreak>globalStreak) {
        globalStreak = currentStreak;
      }
    }
    return globalStreak;
  }

}
