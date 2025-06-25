package medium.ej238_productOfArrayExceptSelf;
import java.util.Arrays;

// Problem: Product of Array Except Self
// Link: https://leetcode.com/problems/product-of-array-except-self

public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        // [22,12,8,6]
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
