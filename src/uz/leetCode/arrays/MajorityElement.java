package uz.leetCode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {


    public static void main(String[] args) {

int []array={3,2,3};
//        int[] array = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement_1(array));
    }


    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int max = nums[0];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > (nums.length / 2)) {
                max = entry.getKey();
            }
        }
        return max;
    }


    public static int majorityElement_1(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length - 1 != i) {

                if (nums[i] == nums[i + 1]) {
                    counter++;
                    if (counter > (nums.length / 2)) {
                        return nums[i];
                    }
                } else {
                    counter = 1;
                }
            }
        }
        return 0;
    }
}
