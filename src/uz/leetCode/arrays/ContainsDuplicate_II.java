//package uz.leetCode.arrays;
//
//public class ContainsDuplicate_II {
//
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 1,2,3};
//        int k = 2;
//        System.out.println(containsNearbyDuplicate_2(nums, k));
//    }
//
//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        for (int i = 0; i < nums.length; i++) {
//            if (i + k <= nums.length) {
//                for (int j = i + 1; j <= Math.abs(i - k); j++) {
//                    if (i != nums.length - 1) {
//                        if (nums[i] == nums[j]) {
//                            if (Math.abs(i - j) <= k) {
//                                return true;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return false;
//    }
//
//
//    public static boolean containsNearbyDuplicate_2(int[] nums, int k) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; (j> i - k || j < i + k); j++) {
//                if (j <= nums.length - 1) {
//                    if (nums[i] == nums[j] && Math.abs(j-i)<=k) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//}
