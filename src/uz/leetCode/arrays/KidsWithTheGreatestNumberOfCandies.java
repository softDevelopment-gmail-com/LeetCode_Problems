package uz.leetCode.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(candies, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>(candies.length);
        int max = 0;
        for (int candy : candies) {
            if (candy >= max) {
                max = candy;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            list.add(i, (candies[i] + extraCandies) >= max);
        }
        return list;
    }
}
