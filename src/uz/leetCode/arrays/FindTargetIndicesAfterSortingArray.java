package uz.leetCode.arrays;

import java.util.LinkedList;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {

    public List<Integer> targetIndices(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    nums[j] += nums[i];
                    nums[i] = nums[j] - nums[i];
                    nums[j] = nums[j] - nums[i];
                }
            }
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
