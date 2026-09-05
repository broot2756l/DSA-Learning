public class SearchRotatedArray{
    public static int searchRotated(int[] arr, int target) {
      int low = 0, high = arr.length - 1;
      while (low <= high) {
        int mid = (int) Math.floor((low + high) / 2);
        if (arr[mid] == target) return mid;
        if (arr[low] <= arr[mid]) { // Left side is sorted
          if (target >= arr[low] && target < arr[mid]) high = mid - 1;
          else low = mid + 1;
        } else { // Right side is sorted
          if (target > arr[mid] && target <= arr[high]) low = mid + 1;
          else high = mid - 1;
        }
      }
      return -1;
    }

    public static void main(String[] args) {
        int[] arr = {60, 50, 10, 20, 30, 40};
        int target = 50;
        int result = searchRotated(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

    }
}