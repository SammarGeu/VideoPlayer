package java5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class uniquePermutations {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the input array to ensure duplicates are adjacent
        permutations(nums, 0, result);
        return result;
    }

    public static void permutations(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length) {
            // Convert the current permutation to a list and add it to the result list
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(new ArrayList<>(permutation));
        } else {
            for (int i = start; i < nums.length; i++) {
                if (!isDuplicate(nums, start, i)) {
                    swap(nums, i, start);
                    permutations(nums, start + 1, result);
                    swap(nums, i, start); // backtrack
                }
            }
        }
    }

    private static boolean isDuplicate(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] == nums[end]) {
                return true;
            }
        }
        return false;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums = {1, 1, 2};
        List<List<Integer>> permutations = permuteUnique(nums);

    }
}
