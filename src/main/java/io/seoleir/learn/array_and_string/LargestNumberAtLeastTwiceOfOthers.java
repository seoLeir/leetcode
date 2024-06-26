package io.seoleir.learn.array_and_string;

public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int largestNumber = 0;
        int largestNumberIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (largestNumber <  nums[i]) {
                largestNumber = nums[i];
                largestNumberIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != largestNumberIndex) {
                if (nums[i] * 2 > largestNumber) {
                    return -1;
                }
            }
        }

        return largestNumberIndex;
    }
}
