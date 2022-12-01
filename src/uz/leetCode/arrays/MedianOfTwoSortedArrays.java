package uz.leetCode.arrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        Arrays.sort(mergedArray);
        if (mergedArray.length % 2 == 0) {
            return (mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2]) / 2D;
        }
        return mergedArray[mergedArray.length / 2] + 0D;
    }

    public double findMedianSortedArrays_1(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            mergedArray[i]=nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            mergedArray[nums1.length+1]=nums2[i];
        }
        int number;
        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = i+1; j < mergedArray.length; j++) {
                if (mergedArray[i]>mergedArray[j]){
                    number=mergedArray[j];
                    mergedArray[j]=mergedArray[i];
                    mergedArray[i]=number;
                }
            }
        }
        int middleIndex=mergedArray.length/2;
        if (mergedArray.length % 2 == 0) {
            return (mergedArray[middleIndex - 1] + mergedArray[middleIndex]) / 2D;
        }
        return mergedArray[middleIndex] + 0D;
    }
}
