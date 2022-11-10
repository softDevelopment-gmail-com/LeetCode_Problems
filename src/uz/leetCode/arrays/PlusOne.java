package uz.leetCode.arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] array = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(array)));


    }

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        if (check(digits)) {
            int[] array = new int[digits.length + 1];
            System.arraycopy(digits, 0, array, 0, digits.length);
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    array[i] = 1;
                } else {
                    array[i] = 0;
                }

            }
            return array;
        }
digits[digits.length-1]+=1;
        for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i]>9&& i!=0){
            digits[i]=0;
            digits[i-1]+=1;
        }
        }

        return digits;


        // this solution for long type length
//        int counter = digits.length - 1;
//        long sum = 0;
//        for (int digit : digits) {
//            sum += digit * Math.pow(10, counter);
//            counter--;
//        }
//        sum += 1;
//        int remainder;
//        int size = Long.toString(sum).length();
//
//        counter = size - 1;
//
//        int[] resultArray = new int[size];
//        for (int i = 0; i < size; i++) {
//            remainder = (int) (sum / (int) (Math.pow(10, counter)));
//            sum -= (long) remainder * (int) (Math.pow(10, counter));
//            resultArray[i] = remainder;
//            counter--;
//        }
//        return resultArray;


    }

    public static boolean check(int[] nums) {
        for (int num : nums) {
            if (num != 9) {
                return false;
            }
        }
        return true;
    }
}
