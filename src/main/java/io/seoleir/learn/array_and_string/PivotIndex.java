package io.seoleir.learn.array_and_string;

public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            int leftSum = sum(nums, 0, i);
            int rightSum = sum(nums, i, nums.length - 1);
            if (leftSum == rightSum) {
                index = i;
                break;
            }
        }

        return index;
    }

    private int sum(int[] nums, int fromIndex, int toIndex) {
        if (fromIndex >= 0 && toIndex < nums.length) {
            int sum = 0;
            for (int i = fromIndex; i <= toIndex; i++) {
                sum = sum + nums[i];
            }
            return sum;
        } else {
            return -1;
        }
    }
}