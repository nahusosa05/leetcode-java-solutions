package easy.ej1431_kidsWithCandies;
import java.util.ArrayList;
import java.util.List;

// Problem: Kids With the Greatest Number of Candies
// Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

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
        var candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
