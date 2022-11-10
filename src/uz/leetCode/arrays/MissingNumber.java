package uz.leetCode.arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int [] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber_2(nums));
    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums[nums.length - 1] + 1;
    }

    public static int missingNumber_2(int[] nums) {
        int len=nums.length;

        int total=len*(len+1)/2;

        for (int num : nums) {
            total -= num;
        }
        return total;
    }

}
