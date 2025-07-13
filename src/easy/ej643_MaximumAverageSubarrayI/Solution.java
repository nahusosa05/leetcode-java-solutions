package easy.ej643_MaximumAverageSubarrayI;

// Problem: Maximum Average Subarray I
// Link: https://leetcode.com/problems/maximum-average-subarray-i

// Sliding Window

public class Solution {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        // agarro la primera ventana para tomarla como valor inicial
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        //{1,12,-5,-6} - k = 4
        double max =  sum;

        //currMax = 0;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return max / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));

        int[] nums1 = {5};
        System.out.println(findMaxAverage(nums1,1));
    }
}
