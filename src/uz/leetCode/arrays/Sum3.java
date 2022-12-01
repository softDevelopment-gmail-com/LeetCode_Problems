package uz.leetCode.arrays;

import java.util.*;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        set.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
