package uz.leetCode.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class FindAllNumbersDisappearedInArray {

    public static void main(String[] args) {
        int[] nums = {1, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findDisappearedNumbers_2(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int i=1;i<=nums.length;i++){
            result.add(i);
        }
        for (int num : nums) {
            result.remove(num);
        }
        return new ArrayList<>(result);
    }
}
