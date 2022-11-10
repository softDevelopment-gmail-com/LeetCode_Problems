package uz.leetCode.arrays;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args) {
        int []nums={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int []array=new int[nums.length*2];
        for (int i=0;i<nums.length;i++){
            array[i]=nums[i];
            array[i+nums.length]=nums[i];
        }
        return array;
    }
}
