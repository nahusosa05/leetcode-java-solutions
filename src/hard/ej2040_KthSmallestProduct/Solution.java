package hard.ej2040_KthSmallestProduct;

// Problem: Kth Smallest Product of Two Sorted Arrays
// Link: https://leetcode.com/problems/kth-smallest-product-of-two-sorted-arrays

public class Solution {
    public static long countLessThanOrEqual(long x, int[] nums1, int[] nums2) {
        long count = 0;
        for (int a : nums1) {
            if (a == 0) {
                if (x >= 0) count += nums2.length;
            } else if (a > 0) {
                int l = 0, r = nums2.length;
                while (l < r) {
                    int m = l + (r - l) / 2;
                    if ((long) a * nums2[m] <= x) l = m + 1;
                    else r = m;
                }
                count += l;
            } else { // a < 0
                int l = 0, r = nums2.length;
                while (l < r) {
                    int m = l + (r - l) / 2;
                    if ((long) a * nums2[m] <= x) r = m;
                    else l = m + 1;
                }
                count += nums2.length - l;
            }
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
        int[] nums1 = {-2,-1,0,1,2};
        int[] nums2 = {-3,-1,2,4,5};
        int k = 3;

        // display 8
        System.out.println(kthSmallestProduct(nums1,nums2,k));
    }
}
