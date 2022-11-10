package uz.leetCode.arrays;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        //[1,3,5,2,4]
        //[6,5,4,3,2,1,7]
        int[] nums1 = {1, 3, 5, 2, 4};
        int[] nums2 = {6, 5, 4, 3, 2, 1, 7};
        System.out.println(Arrays.toString(nextGreaterElement_2(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length];
        short counter = 0;
        for (int k : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                if (k == nums2[j]) {
                    for (int l = j; l < nums2.length; l++) {
                        if (l == nums2.length - 1) {
                            array[counter] = -1;
                            counter += 1;
                            break;
                        } else if (nums2[l + 1] > nums2[j]) {
                            array[counter] = nums2[l + 1];
                            counter += 1;
                            break;
                        }
                    }

                }
            }
        }
        return array;
    }

    public static int[] nextGreaterElement_2(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;

        int[] foundIdx = new int[n1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j]) foundIdx[i] = j;
            }
        }

        int[] ans = new int[n1];
        for (int i = 0; i < n1; i++) {
            for (int j = foundIdx[i] + 1; j < n2; j++) {
                if (nums2[j] > nums2[foundIdx[i]]) {
                    ans[i] = nums2[j];
                    break;
                }
            }

            if (ans[i] == 0) ans[i] = -1;
        }

        return ans;
    }

}
