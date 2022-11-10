package uz.leetCode.arrays;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        //[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,92,93,94,95,96,97,98,99,100]

        //10
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        System.out.println(arithmeticTriplets_1(nums, 10));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int counter = 1;
        int triple = 0;
        int oldI;
        for (int i = 0; i < nums.length; i++) {
            oldI = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == diff) {
                    counter++;
                    i = j;
                    if (counter == 3) {
                        triple++;
                        counter = 1;
                        if (j + 3 >= nums.length) {
                            break;
                        }
                        {
                            j++;
                        }
                        i = oldI;
                    }
                }
            }
            counter = 1;
            i = oldI;
        }
        return triple;
    }

    public static int arithmeticTriplets_1(int[] nums, int diff) {
        int cnt = 0;
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num - diff) && seen.contains(num - diff * 2)) {
                ++cnt;
            }
            seen.add(num);
        }
        return cnt;
    }
}
