import java.util.Arrays;
public class Lab9 {
    /**
     * Problem 1: Write a function that takes a string as input and returns the
     string reversed.
     * Example :Input: s = ["h","e","l","l","o"]
     * Output: Reversed=["o","l","l","e","h"]
     */
    public static char[] reverseString(char[] s) {

        char[] reversedString = new char[s.length];
        int j = 0;

        for (int i = s.length-1; i >= 0; i--) {
            reversedString[j] = s[i];
            j++;
        }
        return reversedString;
    }
    /**
     * Problem 2: Write a function that takes an array nums and an integer
     target.
     * 1. Sorts the array in non-decreasing order using Arrays.sort().
     * 2. Return the index of the target number.Assume that the target appears
     once in the array.
     * Example: Input: nums=[4,1,5,3,2], target=3
     * Output: 2
     */
    public static int findTargetIndex(int[] nums, int target) {
        int x;
        Arrays.sort(nums);
        for (x = 0; x <= nums.length; x++) {
            if (nums[x] == target) {
                return x;
            }
        }
        return x;
    }
    /**
     * Problem 3: Write a function that takes a string s and character c
     * then return how many times the character c appears in the string s.
     * Example: Input :S= "hello world" c='l'
     * Output: 3
     */
    public static int countChar(String s, char c) {
        return 0;
    }
    /**
     * Problem 4: Write a function that finds the first character in a string
     that
     * appears more than once. If no character is repeated, return 0.
     * Example: Input :s = "programming"
     * Output :r
     */
    public static char firstRepeatedChar(String s) {
        return '0';
    }
    public static void main(String[] args) {
        System.out.println("=== Lab 9 ===\n");
// Problem 1: Reverse String
        System.out.println("Problem 1: Reverse String");
        char[] str1 = {'h','e','l','l','o'};
        char[] reversed = reverseString(str1);
        System.out.println("Original: " + Arrays.toString(str1));
        System.out.println("Reversed: " + Arrays.toString(reversed)); // ["o","l","l","e","h"]
        System.out.println();
// Problem 2: Find Target Index
        System.out.println("Problem 2: Find Target Index");
        int[] nums2 = { 4, 1, 5, 3, 2 };
        int target = 3;
        System.out.println("Target index: " + findTargetIndex(nums2,
                target)); // 2
        System.out.println();
// Problem 3: Count Character
        System.out.println("Problem 3: Count Character Occurrences");
        String s3 = "hello world";
        char c3 = 'l';
        System.out.println("Count of '" + c3 + "': " + countChar(s3, c3)); // 3
        System.out.println();
// Problem 4: First Repeated Character
        System.out.println("Problem 4: First Repeated Character");
        String s4 = "programming";
        String s5 = "abc";
        char repeated1 = firstRepeatedChar(s4);
        char repeated2 = firstRepeatedChar(s5);
        if (repeated1 != '0') {
            System.out.println("First repeated character in 'programming': " +
                    repeated1); // r
        } else {
            System.out.println("No repeated character in 'programming'");
        }
        if (repeated2 != '0') {
            System.out.println("First repeated character in 'abc': " + repeated2);
        } else {
            System.out.println("No repeated character");
        }
    }
}