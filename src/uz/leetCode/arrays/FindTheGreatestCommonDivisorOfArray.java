package uz.leetCode.arrays;

import java.util.Arrays;

public class FindTheGreatestCommonDivisorOfArray {

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        for (int i =nums[nums.length-1]; i >0; i--) {
            if (nums[nums.length-1]%i==0){
                if (nums[0]%i==0) {
                    return i;
                }
            }
        }
        return 1;
    }
}
