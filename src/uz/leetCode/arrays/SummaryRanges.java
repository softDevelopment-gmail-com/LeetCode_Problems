//package uz.leetCode.arrays;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SummaryRanges {
//    public static void main(String[] args) {
//        int []nums={0,2,3,4,6,8,9};
//        System.out.println(summaryRanges(nums));
//    }
//
//    public static List<String> summaryRanges(int[] nums) {
//
//        int begin=nums[0];
//        int end=0;
//List<String>list=new ArrayList<>();
//        for (int i = 0; i <nums.length; i++) {
//            if (i==nums.length-1){
//                if (begin==end-1){
//                    list.add(end+"->"+begin);
//                }else{
//                    list.add(begin+"");
//                }
//                break;
//            }
//            if (nums[i]+1==nums[i+1]){
//                continue;
//            }else{
//                end=nums[i];
//            }
//            if(begin==end){
//                list.add(""+begin);
//            }else{
//                list.add(""+begin+"->"+end);
//            }
//            begin=nums[i+1];
//        }
//        return list;
//    }
//}
