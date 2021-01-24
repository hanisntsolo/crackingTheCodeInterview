package dhirendra.january24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List mergeSorted = new ArrayList<>();
        System.out.println(mergeSorted);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));
            int counter1 = 0;
        for(int item: nums1) {
            System.out.println("inside first for "+counter1++);
            System.out.println(item);
            if(item!=0)
            mergeSorted.add(item);
            System.out.println(mergeSorted);
        }
            int counter2 = 0;
        for(int item: nums2) {
            System.out.println("inside second for "+counter2++);
            System.out.println(item);
            if(item!=0)
            mergeSorted.add(item);
            System.out.println(mergeSorted);
        }
        Collections.sort(mergeSorted);
        System.out.println((mergeSorted));

    }
    public static void main(String[] args) {
        int [] nums1 =new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        MergeSorted mergeSorted = new MergeSorted();
        mergeSorted.merge(nums1,m,nums2,n);
    }
}
