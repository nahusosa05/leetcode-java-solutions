package medium.ej1679_MaxNumberOfKSumPairs;
import java.util.Arrays;

// Problem: Max Number of K-Sum Pairs
// Link: https://leetcode.com/problems/max-number-of-k-sum-pairs

public class Solution {
    public static int maxOperations (int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int operations = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                operations++;
                left++;
                right--;
            } else if (sum < k) {
                left ++;
            } else {
                right--;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(maxOperations(nums,5)); // output: 2

        int[] nums1 = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        System.out.println(maxOperations(nums1, 2)); // output: 2
    }
}
