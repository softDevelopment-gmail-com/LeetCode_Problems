package uz.leetCode.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        int[] array = {
                1, 2, 2, 5, 3, 5};
        System.out.println(thirdMax_1(array));
    }

    public int thirdMax(int[] nums) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        set = set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new));
        if (set.size() < 3) {
            return set.stream().max(Integer::compare).get();
        }

        int counter = 1;
        for (Integer integer : set) {
            if (counter == 3) {
                return integer;
            }
            counter++;
        }

        return 0;
    }

    public static int thirdMax_1(int[] nums) {
int length= nums.length;
        Arrays.sort(nums);
        if (length < 3) {
            return nums[length - 1];
        }
        short counter = 1;
        int thirdMax = nums[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] != thirdMax) {
                thirdMax = nums[i];

               counter+=1;
                if (counter == 3) {
                    break;
                }
            }
        }
        if (counter != 3) {
            return nums[length - 1];
        }
        return thirdMax;
    }

}
