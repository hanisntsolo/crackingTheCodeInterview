package dhirendra.january24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]
        int count = 0;
        for(int i = m;i<m+n;i++) {
            nums1[i] = nums2[count++];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int [] nums1 =new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        MergeSort mergeSorted = new MergeSort();
        mergeSorted.merge(nums1,m,nums2,n);
    }
}