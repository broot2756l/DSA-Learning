// Kadanes Algorithm
/* This algorithm finds the maximum sum of a contiguous subarray of size k in an array of integers. */
/*Complexity
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
public class KadaneAlgo{
    public static int maxSubarray(int[] arr, int k) {
      int maxSum, windowSum = 0;
      for (int i = 0; i < k; i++) {
        windowSum += arr[i];
      }
      maxSum = windowSum;
      for (int i = k; i < arr.length; i++) {
        windowSum += arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, windowSum);
      }
      return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSubarray(arr, k));
    }
}