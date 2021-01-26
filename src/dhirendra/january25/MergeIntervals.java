package dhirendra.january25;

import java.util.Arrays;
//This question is still not complete..
public class MergeIntervals {

//        public int[][] merge(int[][] intervals) {
//            for(int i=0;i<intervals.length;i++) {
//                for(int j=0;j<intervals[i].length;j++) {
//                    if(intervals[j][intervals[j].length-1] >= intervals[i+1][0]) {
//                        intervals[i][j] = intervals[j][intervals[j].length-1];
//                    }
//                }
//            }
//            return intervals;
//        }
//    public int[][] merge(int[][] intervals) {
//        for(int i=0;i<intervals.length-1;i++) {
//            for(int j=0;j<intervals[i].length;j++) {
//                if(intervals[j][intervals[j].length-1] >= intervals[i+1][0]) {
//                    // intervals[i] = intervals[j][0],intervals[j+1][intervals[i+1].length];
//                    intervals[i][0] = intervals[j][intervals[j].length-1];
//                    intervals[i][intervals[j].length-1] = intervals[i+1][intervals[j].length-1];
//                }
//            }
//        }
//        return intervals;
//    }
public int[][] merge(int[][] intervals) {
    int [][] newIntervals = new int[intervals.length-1][2];
    int counter = 0;
    for(int i=0;i<intervals.length-1;i++) {
        for(int j=0;j<intervals[i].length-1;j++) {
            if(intervals[j][intervals[j].length-1] >= intervals[i+1][0]) {
                // intervals[i] = intervals[j][0],intervals[j+1][intervals[i+1].length];
                intervals[i][0] = intervals[i][0];
                intervals[i][intervals[j].length-1] = intervals[i+1][intervals[j].length-1];
                counter++;
            }
        }
    }
    for(int i=0;i<counter;i++) {
        newIntervals[i] = intervals[i];
    }
    for(int i=counter+1;i<intervals.length;i++) {
        newIntervals[i-1] = intervals[i];
    }
    return newIntervals;
}

    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] intervals = new int[][] {{1,3},{2,6},{8,10},{15,18}};
        intervals =  mergeIntervals.merge(intervals);
        System.out.println(Arrays.toString(intervals));
    }
}

