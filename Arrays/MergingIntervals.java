// This algorithm merges overlapping intervals in a given array of intervals.
/*Complexity
Time complexity: O(n log n) due to sorting the intervals
Space complexity: O(n) for storing the merged intervals
*/

import java.util.*;

public class MergingIntervals {
    public static int[][] merge(int[][] intervals) {
      if (intervals.length <= 1) {
        return intervals;
      }
      Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
      System.out.println("Sorted intervals: " + Arrays.deepToString(intervals));
      int[][] merged = {{intervals[0][0], intervals[0][1]}};
      System.out.println("Initial merged array: " + Arrays.deepToString(merged));
      for (int i = 1; i < intervals.length; i++) {
        int current = intervals[i][0];
        int lastMerged = merged[merged.length - 1][1];
        if (current <= lastMerged) {
          merged[merged.length - 1][1] = Math.max(lastMerged, intervals[i][1]);
        } else {
          int [][] merged_cpy =  Arrays.copyOf(merged, merged.length + 1);
          merged_cpy[merged_cpy.length - 1] = intervals[i];
          merged = merged_cpy;
        }
      }
      return merged;
    }

    public static void main(String[] args) {
        int[][] intervals = {{2, 6}, {1, 3}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = merge(intervals);
        System.out.println("Merged intervals: " + Arrays.deepToString(mergedIntervals));
    }
}
