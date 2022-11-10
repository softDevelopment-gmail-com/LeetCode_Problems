package uz.leetCode.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
       int []  nums = {2,2,1};
//       int []  nums = {4,1,2,1,2};

        System.out.println(singleNumber_1(nums));

    }
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)){
                map.put(num,2);
            }else{
                map.put(num,1);
            }
        }
         int num=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) {
                num=entry.getKey();
            }
        }
        return num;
    }
    public static int singleNumber_1(int[] nums){
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    nums[i]+=nums[j];
                    nums[j]=nums[i]-nums[j];
                    nums[i]=nums[i]-nums[j];
                }
            }
        }

        for (int i = 0; i < nums.length; i+=2) {
            if (i!=nums.length-1&&nums[i]!=nums[i+1]){
                return nums[i];
            }
            if (i==nums.length-1){
                return nums[i];
            }
        }
        return 0;
    }

    public static int singleNumber_2(int[] nums){

        int num;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    num=nums[i];
                    nums[i]=nums[j];
                    nums[j]=num;
                }
            }
        }
        for (int i = 0; i < nums.length; i+=2) {
            if (i!=nums.length-1&&nums[i]!=nums[i+1]){
                return nums[i];
            }
            if (i==nums.length-1){
                return nums[i];
            }
        }
        return 0;
    }
}

