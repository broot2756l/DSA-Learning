/* Complexity
  * Time complexity: O(n)
  * Space complexity: O(1)
*/

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
      int left = 0;
      int right = numbers.length - 1;
      while (left < right) {
        int sum = numbers[left] + numbers[right];
        if (sum == target) {
          return new int[]{left + 1, right + 1};
        } else if (sum < target) {
          left++;
        } else {
          right--;
        }
      }
      return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("Indices of the two numbers that add up to " + target + " are: [" + result[0] + ", " + result[1] + "]");
    }
    
}
