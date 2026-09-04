// Sliding window approach to find the maximum sum of a subarray
/* This algorithm finds the maximum sum of a contiguous subarray in an array of integers. */
/* Complexity
    Time Complexity: O(n)
    Space Complexity: O(1)
 */
public class MaxSumSubarray {
    public static int maxSubArray(int[] nums) {
      int maxSum = nums[0];
      int curSum = nums[0];
      for (int i = 1; i < nums.length; i++) {
        curSum = Math.max(nums[i], curSum + nums[i]);
        maxSum = Math.max(maxSum, curSum);
      }
      return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Maximum sum of subarray is: " + maxSubArray(arr));
    }
}