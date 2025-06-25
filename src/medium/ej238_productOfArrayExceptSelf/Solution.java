package medium.ej238_productOfArrayExceptSelf;
import java.util.Arrays;

// Problem: Product of Array Except Self
// Link: https://leetcode.com/problems/product-of-array-except-self

public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] output = new int[nums.length];

        for (int j = 0; j < nums.length; j++) {
            int result = 1;
            int i = 0;
            while (i < nums.length) {
                if (i != j) {
                    result *= nums[i];
                }
                i++;
            }
            output[j] = result;
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] nums2 = {-1,1,0,-3,3};

        // [22, 12, 8, 6]
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        // [0, 0, 9, 0, 0]
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }
}
