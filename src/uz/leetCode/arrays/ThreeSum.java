package uz.leetCode.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreeSum {
    public static void main(String[] args) {
        int [] array={-1,0,1,2,-1,-4};
        System.out.println(threeSum(array));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        for (int i = 2; i < nums.length; i++) {
            int firstNumber=nums[i-2];
            int secondNumber=nums[i-1];
                    if (nums[i] + secondNumber + firstNumber == 0) {
                        list.add(new ArrayList<>(
                                Stream.of(nums[i],secondNumber, firstNumber).sorted().collect(Collectors.toList())
                        ));

            }
        }
        return new ArrayList<>(list);
    }

}
