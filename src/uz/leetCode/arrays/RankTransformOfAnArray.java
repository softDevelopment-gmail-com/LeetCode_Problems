package uz.leetCode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfAnArray {
    public static void main(String[] args) {
        int[] array = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(arrayRankTransform(array)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] copyArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArray);
        int counter = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= copyArray.length; i++) {
            if (!map.containsKey(copyArray[i - 1])) {
                map.put(copyArray[i - 1], counter);
                counter++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
