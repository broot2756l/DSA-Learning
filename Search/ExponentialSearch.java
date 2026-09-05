/* Complexity
    Time: O(log n)
    Space: O(1)
*/

public class ExponentialSearch {

    public static int binarySearchRange(int[] arr, int target, int start_idx, int end_idx){
        while(start_idx < end_idx){
            int mid = start_idx + (end_idx-start_idx) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                start_idx = mid + 1;
            }
            else{
                end_idx = mid - 1;
            }

        }
        return -1;
    }

    public static int exponentialSearch(int[] arr, int target){
        int n = arr.length;
        if (arr[0] == target){
            return 0;
        }
        int i = 1;
        while(i < n && arr[i] <= target){
            i = i*2;
        }
        return binarySearchRange(arr, target, i/2, Math.min(i, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 16, 32, 64, 128, 256, 512};
        int target = 128;
        int result = exponentialSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
}
