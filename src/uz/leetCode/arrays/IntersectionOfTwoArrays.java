package uz.leetCode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (Integer i : set1) {
            if (set2.contains(i)) {
                list.add(i);
            }
        }
        int[] array = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }


    public int[] intersection_1(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        int size=0;
        int counter=0;
        if (set1.size()>=set2.size()){
            return getInts(set1, set2, counter);
        }else{
            return getInts(set2, set1, counter);
        }


    }

    private int[] getInts(Set<Integer> set1, Set<Integer> set2, int counter) {
        int size;
        set2.removeIf(num -> !set1.contains(num));
        size=set2.size();
        int [] array=new int[size];
        for (Integer i : set2) {
            array[counter]=i;
            counter++;
        }
        return array;
    }

}
