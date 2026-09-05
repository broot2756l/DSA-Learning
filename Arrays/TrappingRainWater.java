/* Complexity
  Time complexity: O(n)
  Space complexity: O(1)
 */

public class TrappingRainWater {
    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int [] height = {4, 2, 0, 3, 2, 5};
        int trappedWater = trap(height);
        System.out.println("Total trapped water: " + trappedWater);
    }
    
}
