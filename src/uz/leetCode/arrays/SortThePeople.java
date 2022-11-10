package uz.leetCode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople {
    public static void main(String[] args) {
        //names = ["Mary","John","Emma"], heights = [180,165,170]
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        int counter = 0;
        for (int height : heights) {
            map.put(height, names[counter]);
            counter++;
        }
        int number;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] > heights[j]) {
                    number = heights[i];
                    heights[i] = heights[j];
                    heights[j] = number;
                }
            }
        }
        counter--;

        for (int height : heights) {
            names[counter] = map.get(height);
            counter--;
        }

        return names;
    }

}
