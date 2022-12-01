package uz.leetCode.arrays;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }
    public static int minimumSum(int num) {
        int[] array = new int[4];
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        Arrays.sort(array);
        return (array[0] * 10 + array[3]) + (array[1] * 10 + array[2]);
    }
}
