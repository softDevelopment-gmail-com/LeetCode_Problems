package uz.leetCode.arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,};
        System.out.println(Arrays.toString(runningSum_2(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] array = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            array[i] = sum;
        }
        return array;
    }

    public static int[] runningSum_1(int[] nums) {
        int[] array = new int[nums.length];

        for (int i = 1; i <= nums.length; i++) {
            array[i - 1] = nums[i - 1];
            if (i != nums.length) {
                nums[i] += nums[i - 1];
            }
        }
        return array;
    }

    public static int[] runningSum_2(int[] nums) {
        for (int i = 1; i <= nums.length - 1; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

}
