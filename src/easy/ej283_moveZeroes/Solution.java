package easy.ej283_moveZeroes;

// Problem: Move Zeroes
// Link: https://leetcode.com/problems/move-zeroes

import java.util.Arrays;

public class Solution {
    public static void moveZeroes(int[] nums) {
        int readPoint = 0;
        int writePoint = 0;
        // System.out.println(Arrays.toString(nums));

        while (readPoint < nums.length) {
            int currentNum = nums[readPoint];
            if (currentNum != 0) {
                nums[writePoint] = currentNum;
                writePoint++;
            }
            readPoint++;
        }
        while (writePoint < nums.length) {
            nums[writePoint] = 0;
            writePoint++;
        }
        // System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

        int[] nums1 = {0};
        moveZeroes(nums1);

        int[] nums2 = {0,1,0,0,66,123,12};
        moveZeroes(nums2);
    }
}
