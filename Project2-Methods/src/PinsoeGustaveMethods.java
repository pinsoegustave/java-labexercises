public class PinsoeGustaveMethods {

//    Method 1: Return the median
    public int medianOf3(int a, int b, int c) {
        boolean b1 = c <= b && b <= a;
        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            return b;
        } else if ((b <= a && a <= c) || (c <= a && a <= b)) {
            return a;
        }
        else {
            return c;
        }
    }

//    Method 2: Check if the monkey is happy
    public boolean happyMonkey(int numBananas, boolean youThrow) {
        if (youThrow) {
            return numBananas < 14;
        } else {
            return numBananas >= 7 && numBananas <= 16;
        }
    }

//    Method 3: Form reverse string
    public String formReversedString(String[] letters, int n) {
        String result = "";

        if (n >= 0 && n < letters.length) {
            String skip = letters[n];

            for (int i = letters.length - 1; i >= 0; i--) {
                if (i != n && !letters[i].equals(skip)) {
                    result = result + letters[i];
                }
            }
        } else {
            for (int i = letters.length - 1; i >= 0; i--) {
                result = result + letters[i];
            }
        }

        return result;
    }

//    Method 4: Connect Strings
    public String connectStrings(String str1, String str2) {
        boolean firstOddString = (str1.length() % 2 == 1);
        boolean secOddString = (str2.length() % 2 == 1);

        if (firstOddString && !secOddString) {
            return str2.charAt(0) + str1 + str2.charAt(str2.length() - 1);
        } else if (firstOddString && secOddString) {
            char middleChar = str2.charAt(str2.length() / 2);
            return ""+ str1.charAt(0) + middleChar + str1.charAt(str1.length() - 1);
        } else {
            String midFirst = str1.substring(1, str1.length() - 1);
            int midSec = str2.length() / 2;
            return str2.substring(0, midSec) + midFirst + str2.substring(midSec);
        }
    }

//    Method 5: Check if there is a sum
    public boolean isSum(int a, int b, int c) {
        if (a == b + c) {
            return true;
        } else if (b == a + c) {
            return true;
        } else if (c == a + b) {
            return true;
        } else {
            return false;
        }
    }

}
