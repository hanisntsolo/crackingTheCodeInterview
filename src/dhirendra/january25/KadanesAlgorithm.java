package dhirendra.january25;
//Good Question make sure to revisit
public class KadanesAlgorithm {
    public static void main(String[] args) {
        Solution solution = new Solution();
       int [] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums));
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int currentStreak = nums[0];
        int globalStreak = nums[0];
        for (int i=1;i<nums.length;i++) {
            currentStreak = java.lang.Math.max(nums[i], currentStreak+nums[i]);
//            if(globalStreak<0)
//                globalStreak=0;
            if(currentStreak>globalStreak){
                globalStreak = currentStreak;
            }
        }
    return globalStreak;
    }
}
