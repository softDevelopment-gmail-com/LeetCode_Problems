package uz.leetCode.arrays;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    public boolean canBeIncreasing(int[] nums) {
        int counter = 0;
        int n = 0;
        int number;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] >= nums[j]) {
                    number = nums[i];
                    nums[i] = nums[j];
                    nums[j] = number;
                    counter++;
                }
            }
            if (counter > 0) {
                n++;
            }
            counter = 0;
        }
        return n == 1;
    }
    // [105,924,32,968]
}
