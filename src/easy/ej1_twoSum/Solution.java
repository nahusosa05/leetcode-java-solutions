package easy.ej1_twoSum;
import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        for (int i = 0; i<nums.length; i++) {
            for (int j = i + 1; j<nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    out[0] = i;
                    out[1] = j;
                    break;
                }
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int[] indexes = twoSum(nums,6);
        System.out.println(Arrays.toString(indexes));
    }
}
