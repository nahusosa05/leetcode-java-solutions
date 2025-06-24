package easy.ej2996_smallestMissingInteger;

// Problema: Smallest Missing Integer Greater Than Sequential Prefix Sum
// Enlace: https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum

public class Solution {
    // Busco el número que sigue a una cadena consecutiva de números en el array
    // [1,2,3,2,5] -> 1,2,3 -> retorna la suma 6 si la suma no está en el array
    // [3,4,5,1,12,14,13] -> 3,4,5 su suma es 12 -> 12 está en el array -> 12,13,14 retorna 15

    public static int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i<nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        while (true) {
            boolean isfound=false;
            for (int num : nums) {
                if (num == sum) {
                    isfound = true;
                    break;
                }
            }
            if(!isfound){
                return sum;
            }
            sum++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,12,13,14};
        System.out.println(missingInteger(nums));
    }
}
