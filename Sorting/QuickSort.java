/*Complexity
    Time: O(Nlog(N))
    Space: O(log(N))
*/

import java.util.Arrays;

public class QuickSort {
    public static int[] quickSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println(Arrays.toString(QuickSort.quickSort(arr)));
    }
    
}
