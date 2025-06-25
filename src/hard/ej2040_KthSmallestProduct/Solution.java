package hard.ej2040_KthSmallestProduct;

// Problem: Kth Smallest Product of Two Sorted Arrays
// Link: https://leetcode.com/problems/kth-smallest-product-of-two-sorted-arrays

public class Solution {
    public static long countLessThanOrEqual(long target, int[] nums1, int[] nums2) {
        long count = 0;
        for (int num1 : nums1) {
            if (num1 == 0) {
                if (target >=0) count += nums2.length;
                continue;
            }

            int low = 0, high = nums2.length;
            while (low < high) {
                int mid = low + (high - low) / 2;
                long product = (long) num1 * nums2[mid];
                if (product <= target) {
                    if (num1 > 0) low = mid + 1;
                    else high = mid;
                } else {
                    if (num1 > 0) high = mid;
                    else low = mid + 1;
                }
            }
            count += (num1 > 0) ? low : nums2.length - low;
        }
        return count;
    }

    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        // defino rangos de productos posibles ()
        long left = -100_000L * 100_000L;
        long right = 100_000L * 100_000L;

        while (left < right) {
            long mid = (left + right) / 2;

            if (countLessThanOrEqual(mid, nums1, nums2) < k) {
                left = mid + 1; // hay pocos productos <= mid, necesito ir más arriba
            } else {
                right = mid; // hay suficientes productos <= mid, podría ser la respuesta
            }
        }

        return left; // o right, ya que left == right
    }

    public static void main(String[] args) {
        int[] nums1 = {-3,0,2};
        int[] nums2 = {-2,1,3};
        // Lo que hace este método, es buscar el número de este array de productos de elementos de nums 1
        // y nums 2, en la posición Kth que se desee.
        // {-9,-4,-3,0,0,0,2,6,6}
        int k = 4;

        // display 8
        System.out.println(kthSmallestProduct(nums1,nums2,k));
    }
}
