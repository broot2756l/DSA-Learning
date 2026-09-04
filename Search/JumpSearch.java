/*Complexity
    Time: O(√n)
    Space: O(1)
*/

public class JumpSearch {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1; 
            }
        }

        while (arr[prev] < target) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1; 
            }
        }

        if (arr[prev] == target) {
            return prev; 
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
        int target = 14;
        int result = jumpSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
}
