package easy.ej27_RemoveElement;
import java.util.Arrays;

// Problem: Remove Element
// Link: https://leetcode.com/problems/remove-element

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;
        System.out.println(Arrays.toString(nums));
        while (left < nums.length) {
            int firstNum = nums[left];
            int lastNum = nums[right];
            if (firstNum != val && lastNum != val) {
                right--;
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return right;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int k = removeElement(nums, val);
        System.out.println(k); // output: 5
    }
}
