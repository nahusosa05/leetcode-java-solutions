package easy.ej26_RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

// Problem: Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array

public class Solution {
    // Estrategia: Two pointers para leer el array y otra para guardar donde escribo.
    // It does not matter what you leave beyond the returned k.

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        int rigth = 0;
        // System.out.println(Arrays.toString(nums));
        while (left < nums.length) {
            int currentNum = nums[left];

            while (left < nums.length && nums[left] == currentNum) {
                left++;
            }
            nums[rigth] = currentNum;
            rigth++;
        }
        // System.out.println(Arrays.toString(nums));
        return rigth;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums)); // Output 2

        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums1)); // Output 5
    }
}
