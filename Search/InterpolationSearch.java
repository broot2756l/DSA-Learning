/*
Time complexity = O(log(log(N)))
Space complexity = O(1)
*/

public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int target) {

      int low = 0, high = arr.length - 1;

      while (low <= high && target >= arr[low] && target <= arr[high]) {

        if (low == high) {

          if (arr[low] == target) return low;

          return -1;

        }

        int pos = low + (int) Math.floor(((target - arr[low]) * (high - low)) / (arr[high] - arr[low])); // Interpolation algorithm

        if (arr[pos] == target) return pos;

        if (arr[pos] < target) low = pos + 1;

        else high = pos - 1;

      }

      return -1;
    
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 60;
        int result = interpolationSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
