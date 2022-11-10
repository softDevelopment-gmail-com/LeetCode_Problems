package uz.leetCode.arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
//[-1,-1,-1,-1,0,1]
        //[-1,-1,0,-1,-1,-1]xx
        //[-1,-1,0,1,0,-1]
        //[-1,-1,0,-1,-1,-1] 3 xx
        //[-1,-1,-1,-1,0,1]
        //[-1,-1,0,1,0,-1]
        //[1,7,3,6,5,6]
        //[-1,-1,0,0,-1,0]
        //[-1,-1,0,0,-1,0]
        //[-1,-1,0,1,-1,-1]
        int[] nums = {-1, -1, 0, 1, -1, -1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        short middleIndex = (short) (nums.length / 2 - 1);
        int leftSum = 0;
        int rightSum = 0;
        short counter = 0;
        while (true) {
            for (int i = 0; i < middleIndex; i++) {
                leftSum += nums[i];
            }
            for (int i = nums.length - 1; i > middleIndex; i--) {
                rightSum += nums[i];
            }
            if (leftSum == rightSum) {
                return middleIndex;
            } else if (nums[middleIndex] > 0) {
                if (leftSum > rightSum) {
                    middleIndex -= 1;
                } else {
                    middleIndex += 1;
                }
            } else if (nums[middleIndex] == 0) {
                if (middleIndex > 0 || middleIndex < nums.length - 1) {
                    if (leftSum > rightSum) {
                        if (nums[middleIndex - 1] < 0) {
                            middleIndex += 1;
                        } else {
                            middleIndex -= 1;
                        }
                    } else if (nums[middleIndex - 1] < 0 && nums[middleIndex + 1] <= 0) {
                        middleIndex -= 1;
                    } else {
                        middleIndex += 1;
                    }
                }
            } else {
                if (leftSum > rightSum) {
                    middleIndex += 1;
                } else {
                    middleIndex -= 1;
                }
            }
            counter += 1;
            if (counter > nums.length / 2) {
                return -1;
            }
            leftSum = 0;
            rightSum = 0;
        }

    }

}
