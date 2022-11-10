package uz.leetCode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int val;
        int freq;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            freq = nums[i - 1];
            val = nums[i];
            for (int j = 0; j < freq; j++) {
                list.add(val);
            }
            i++;
        }
        int[] decompressedArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            decompressedArray[i] = list.get(i);
        }
        return decompressedArray;
    }

    public int[] decompressRLElist_fromDiscussion(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }

        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }

}
