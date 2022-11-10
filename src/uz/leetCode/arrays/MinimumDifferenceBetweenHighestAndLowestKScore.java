//package uz.leetCode.arrays;
//
//import java.util.Arrays;
//
//public class MinimumDifferenceBetweenHighestAndLowestKScore {
//
//    public static void main(String[] args) {
//        int []nums={87063,61094,44530,21297,95857,93551,9918};
//        int k=6;
//        System.out.println(minimumDifference(nums,k));
//    }
//    public static int minimumDifference(int[] nums, int k) {
//        if (nums.length < 2) {
//            return 0;
//        }
//        Arrays.sort(nums);
//        int value=0;
//        int min= nums[nums.length - 1] - nums[nums.length - 2];
//        for (int i=0;i<nums.length;i++){
//            for (int j=i+1;j<nums.length;j++){
//                if (i<nums.length-1){
//                    value=nums[j]-nums[i];
//                    if (value<min){
//                        min=value;
//                    }
//                }
//            }
//        }
//        return min;
//    }
//
//}
