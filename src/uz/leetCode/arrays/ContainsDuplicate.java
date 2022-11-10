package uz.leetCode.arrays;

import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }

    public boolean containsDuplicate_1(int []nums){
        int [] distinct = Arrays.stream(nums).distinct().toArray();
        return distinct.length != nums.length;
    }

    public boolean containsDuplicate_2(int []nums){
        TreeSet<Integer>set=new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
     return set.size()!=nums.length;
    }

    public boolean containsDuplicate_3(int []nums){
        HashSet<Integer> set=new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }

}
