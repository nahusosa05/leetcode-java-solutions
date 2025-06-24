package easy.ej1431_kidsWithCandies;
import java.util.ArrayList;
import java.util.List;

// Problema: Kids With the Greatest Number of Candies
// Enlace: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var listCandies = new ArrayList<Boolean>();
        for (int j : candies) {
            boolean isMoreCandies = true;
            int totalCandy = j + extraCandies;
            for (int candy : candies) {
                if (totalCandy < candy) {
                    isMoreCandies = false;
                    break;
                }
            }
            if (isMoreCandies) {
                listCandies.add(true);
            } else {
                listCandies.add(false);
            }
        }
        return listCandies;
    }

    public static void main(String[] args) {
        var candies = new int[]{4,2,1,1,2};
        int extraCandies = 4;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
