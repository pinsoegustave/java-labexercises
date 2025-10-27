import java.util.Arrays;

public class Leetcode {
    /**
     * Problem 1: Running Sum of 1d Array (LeetCode #1480)
     * Given an array nums, return the running sum where
     * runningSum[i] = sum(nums[0]...nums[i])
     * <p>
     * Example: [1,2,3,4] -> [1,3,6,10]
     */
    public static int[] runningSum(int[] nums) {
        int []runningSums = new int[nums.length];
            runningSums[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            runningSums[i] = runningSums[i-1] + nums[i];
        }

        return runningSums;     // Replace with your answer

    }

    /**
     * Problem 2: Two Sum (LeetCode #1)
     * Given an array of integers nums and an integer target,
     * return indices of the two numbers that add up to target.
     * <p>
     * Example: nums = [2,7,11,15], target = 9 -> [0,1]
     * Because nums[0] + nums[1] = 2 + 7 = 9
     */
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i]+nums[j] == target) {
                    return new int[] {
                            i, j
                    };
                }
            }
        }

        return null; // Replace with your answer
    }

    /**
     * Problem 3: Sum of Multiples (LeetCode #2652)
     * Given a positive integer n, find the sum of all integers
     * from 1 to n that are divisible by 3, 5, or 7.
     * <p>
     * Example: n = 10 -> 40
     * Because 3+5+6+9+10 = 40
     */
    public static int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0 ) {
                sum+=1;
            }
        }

        return sum; // Replace with your answer
    }

    /**
     * Problem 4: Maximum Sum With Exactly K Elements (LeetCode #2656)
     * Find the maximum element in nums, then create k numbers:
     * max, max+1, max+2, ..., max+(k-1)
     * Return the sum of these k numbers.
     * <p>
     * Example: nums = [1,2,3,4,5], k = 3 -> 18
     * Because max=5, and 5+6+7 = 18
     */
    public static int maximizeSum(int[] nums, int k) {
        return 0; // Replace with your answer
    }

    /**
     * Problem 5: Intersection of Two Arrays (LeetCode #349)
     * Given two arrays, return an array of their intersection.
     * Each element in the result must be unique.
     * <p>
     * Example: nums1 = [1,2,2,1], nums2 = [2,2] -> [2]
     * <p>
     * Simplified version: You can assume the result will have
     * at most 10 elements for this practice.
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        return null; // Replace with your answer
    }

    public static void main(String[] args) {
        System.out.println("=== LeetCode Array Practice ===\n");
// Test Problem 1: Running Sum (LeetCode #1480)
        System.out.println("Problem 1: Running Sum");
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = runningSum(nums1);
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + Arrays.toString(result1));
        System.out.println("Expected: [1, 3, 6, 10]\n");
// Test Problem 2: Two Sum (LeetCode #1)
        System.out.println("Problem 2: Two Sum");
        int[] nums2 = {2, 7, 11, 15};
        int target2 = 9;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Input: " + Arrays.toString(nums2) + ", target = " +
                target2);
        System.out.println("Output: " + Arrays.toString(result2));
        System.out.println("Expected: [0, 1]\n");
// Test Problem 3: Sum Multiples (LeetCode #2652)
        System.out.println("Problem 3: Sum Multiples");
        int n3 = 10;
        int result3 = sumOfMultiples(n3);
        System.out.println("Input: n = " + n3);
        System.out.println("Output: " + result3);
        System.out.println("Expected: 40 (3+5+6+9+10)\n");
// Test Problem 4: Maximum Sum With K Elements (LeetCode #2656)
        System.out.println("Problem 4: Maximum Sum With K Elements");
        int[] nums4 = {1, 2, 3, 4, 5};
        int k4 = 3;
        int result4 = maximizeSum(nums4, k4);
        System.out.println("Input: " + Arrays.toString(nums4) + ", k = " + k4);
        System.out.println("Output: " + result4);
        System.out.println("Expected: 18 (5+6+7)\n");
// Test Problem 5: Intersection of Two Arrays (LeetCode #349)
        System.out.println("Problem 5: Intersection of Two Arrays");
        int[] nums5a = {1, 2, 2, 1};
        int[] nums5b = {2, 2};
        int[] result5 = intersection(nums5a, nums5b);
        System.out.println("Input: " + Arrays.toString(nums5a) + ", " +
                Arrays.toString(nums5b));
        System.out.println("Output: " + Arrays.toString(result5));
        System.out.println("Expected: [2]\n");
    }
}