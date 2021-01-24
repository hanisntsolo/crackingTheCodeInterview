package dhirendra.january24;
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//    Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
//
//
//
//    Example 1:
//
//    Input: nums = [3,0,1]
//    Output: 2
//    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//    Example 2:
//
//    Input: nums = [0,1]
//    Output: 2
//    Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//    Example 3:
//
//    Input: nums = [9,6,4,2,3,5,7,0,1]
//    Output: 8
//    Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
//    Example 4:
//
//    Input: nums = [0]
//    Output: 1
//    Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1]. 1 is the missing number in the range since it does not appear in nums.
//
//
//    Constraints:
//
//    n == nums.length
//    1 <= n <= 104
//    0 <= nums[i] <= n
//    All the numbers of nums are unique.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int found = 0;
//        for(int i=0;i<nums.length-1;i++) {
//            if(nums[i]+1 != (nums[i+1])) {
//                found = nums[i]+1;
//            }
//        }
//        return found;
//    }
//public int missingNumber(int[] nums) {
//    Arrays.sort(nums);
//    int found = 0;
//    if(nums[0] == 0 && nums.length == 1) return 1;
//    for(int i=0;i<nums.length-1;i++) {
//        if(nums[i]+1 != (nums[i+1])) {
//            found = nums[i]+1;
//        } else if (nums[i]+1 == (nums[i+1])) {
//            found = nums[nums.length-1]+1;
//        }
//    }
//    return found;
//}
    public int missingNumber(int[] nums) {
        int n = nums.length;
        List list = new ArrayList(nums.length);
        for (int i : nums) {
            list.add(i);
        }
        for (int i = 1; i < n + 1; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }
        return 0;
    }

        public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        int[] test = new int[]{1,2};
        System.out.println(test);
        System.out.println(obj.missingNumber(test));
    }
}
