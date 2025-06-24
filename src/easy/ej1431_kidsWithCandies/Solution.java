package easy.ej1431_kidsWithCandies;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var listCandies = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            boolean isMoreCandies = true;
            int totalCandy = candies[i] + extraCandies;
            for (int candy : candies) {
                if (totalCandy < candy) {
                    isMoreCandies = false;
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
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
