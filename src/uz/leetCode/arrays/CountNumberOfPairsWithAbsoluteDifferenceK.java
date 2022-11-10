package uz.leetCode.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfPairsWithAbsoluteDifferenceK {

    public static void main(String[] args) {
        //[1,2,2,1]
        //1
        int[] array = {1, 2, 2, 1};
        System.out.println(countKDifference_1(array, 1));
    }

    public static int countKDifference(int[] nums, int k) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int countKDifference_1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            count += map.getOrDefault(i - k, 0) + map.getOrDefault(i + k, 0);
        }
        return count;
    }

}
