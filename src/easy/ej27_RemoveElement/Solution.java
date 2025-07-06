package easy.ej27_RemoveElement;
import java.util.Arrays;

// Problem: Remove Element
// Link: https://leetcode.com/problems/remove-element

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        // System.out.println(Arrays.toString(nums));
        while (left <= right ) {
            int currentNum = nums[left];
            if (currentNum == val) {
                // Skip all occurrences of `val` from the right end
                while (right > left && nums[right] == val) {
                    right--;
                }

                if (left >= right) break;

                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
            left++;
        }
        // System.out.println(Arrays.toString(nums));
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int[] nums1 = {0,1,2,2,3,0,4,2};

        int k = removeElement(nums, 2);
        System.out.println(k); // output: 2
        k = removeElement(nums1, 2);
        System.out.println(k); // output: 5
    }
}
