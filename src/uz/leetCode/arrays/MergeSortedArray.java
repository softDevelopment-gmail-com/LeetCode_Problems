package uz.leetCode.arrays;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
//        int [] nums1 = {1}; int m = 1; int [] nums2 = {}; int  n = 0;
        int [] nums1 = {1,2,3,0,0,0}; int m = 3; int [] nums2 = {2,5,6}; int  n = 3;
        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
        }


 for (int i=0;i<nums1.length;i++){
     for (int j=i+1;j<nums1.length;j++){
         if (nums1[i]>nums1[j]){
             nums1[i]+=nums1[j];
             nums1[j]=nums1[i]-nums1[j];
             nums1[i]=nums1[i]-nums1[j];
         }
     }
 }
//        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

}
