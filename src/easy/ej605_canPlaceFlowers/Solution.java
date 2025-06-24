package easy.ej605_canPlaceFlowers;

// Problem: Can Place Flowers
// Link: https://leetcode.com/problems/can-place-flowers

public class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean out = false;
        if (n == 0) return true;

        int i = 0;
        while (i< flowerbed.length) {
            if (flowerbed[i] == 0) {
                boolean leftFlower = (i==0 || flowerbed[i-1] == 0);
                boolean rightFlower = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);

                if (leftFlower && rightFlower) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0) out = true;
                    i += 2;
                    continue;
                }
            }
            i++;
        }
        return out;
    }

    public static void main(String[] args) {
        // Given an integer array flowerbed containing 0 and
        // 1, where 0 means empty and 1 means not empty
        int[] flowerbed = {1,0,1,0,1,0,1,0};
        System.out.println(canPlaceFlowers(flowerbed,0));
    }
}
