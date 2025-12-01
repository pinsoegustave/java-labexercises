import java.util.Arrays;
public class Lab12 {
    /**
     * Problem 1: Reverse a string recursively.
     * Example: Input: s = "hello"
     * Output: "olleh"
     */
    public static String reverseString(String s) {

        if (s.isEmpty()) {
            return s;
        }
        return reverseString(s.substring(1))+ s.charAt(0);
    }
    /**
     * Problem 2: Check if a string is a palindrome using recursion.
     * Example: Input: s = "racecar"
     * Output: true
     * Input: s = "hello"
     * Output: false
     */
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length()-1)) return false;

        return isPalindrome(s.substring(1, s.length()-1));
    }
    /**
     * Problem 3: Sum of an array recursively.
     * Example: Input: nums = [1,2,3,4]
     * Output: 10
     */
    public static int sumArray(int[] nums, int index) {
        int sum = 0;

        for (int i = 0; i <= nums.length-1; i++) {
            sum += nums[i];
        }
        return sum;
    }
    /**
     * Problem 4: Count the number of digits in a positive integer using recursion.
     * Example: Input: n = 12345
     * Output: 5
     */
    public static int countDigits(int n) {

        if (n < 10) {
            return 1;
        }
        return 1+countDigits(n/10);
    }


    public static void main(String[] args) {
        System.out.println("=== Lab 12 ===\n");
// Problem 1: Reverse String
        System.out.println("Problem 1: Reverse String Recursively");
        String str1 = "hello";
        String reversed = reverseString(str1);
        System.out.println("Original: " + str1);
        System.out.println("Reversed: " + reversed); // "olleh"
        System.out.println();
// Problem 2: Palindrome Check
        System.out.println("Problem 2: Palindrome Check Recursively");
        String p1 = "racecar";
        String p2 = "hello";
        System.out.println(p1 + " is palindrome? " + isPalindrome(p1)); // true
        System.out.println(p2 + " is palindrome? " + isPalindrome(p2)); // false
        System.out.println();
// Problem 3: Sum of Array
        System.out.println("Problem 3: Sum of Array Recursively");
        int[] nums = {1, 2, 3, 4};
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Sum: " + sumArray(nums, 0)); // 10
        System.out.println();
// Problem 4: Count Digits
        System.out.println("Problem 4: Count Digits Recursively");
        int num = 12345;
        System.out.println("Number: " + num);
        System.out.println("Digit count: " + countDigits(num)); // 5
    }
}
