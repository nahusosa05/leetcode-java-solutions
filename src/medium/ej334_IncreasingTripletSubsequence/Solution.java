package medium.ej334_IncreasingTripletSubsequence;

// Problem: Increasing Triplet Subsequence
// Link: https://leetcode.com/problems/increasing-triplet-subsequence

public class Solution {
    public static boolean increasingTriplet(int[] nums) {
        // variables para retener valores
        int firstLowerValue = Integer.MAX_VALUE;
        int secondLowerValue = Integer.MAX_VALUE;

        for (int num : nums) {
            // num es menor que el primer guardado? si es así lo guardo en el.
            if (num <= firstLowerValue) {
                firstLowerValue = num;
            // num es menor que el segundo guardado? si es así lo guardo en el.
            } else if (num <= secondLowerValue) {
                secondLowerValue = num;
            // si no, es mayor que los 2 (first,second)
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        // display True
        System.out.println(increasingTriplet(nums));
    }
}
