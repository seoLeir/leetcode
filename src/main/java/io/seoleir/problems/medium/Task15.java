package io.seoleir.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task15 {

    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> hashSet = new HashSet<>();

        Arrays.parallelSort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int minusValue = -nums[i];

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (nums[left] + nums[right] > minusValue) {
                    right--;
                } else if (nums[left] + nums[right] < minusValue) {
                    left++;
                } else {
                    hashSet.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
            }
        }

        return new ArrayList<>(hashSet);
    }
}
