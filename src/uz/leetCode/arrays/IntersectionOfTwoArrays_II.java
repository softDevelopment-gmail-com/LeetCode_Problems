package uz.leetCode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoArrays_II {
    public static void main(String[] args) {
        int [] nums1={4,9,5};
        int [] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> set1 = new LinkedList<>();
        List<Integer> set2 = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        if (set2.size() >= set1.size()) {
            for (Integer i : set1) {
                if (set2.contains(i)) {
                    list.add(i);
                    set2.remove(i);
                }
            }
        } else {
            for (Integer i : set2) {
                if (set1.contains(i)) {
                    list.add(i);
                    set1.remove(i);
                }
            }
        }
        int[] array = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

}
