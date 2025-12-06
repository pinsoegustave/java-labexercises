import java.util.Arrays;

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

//    Method 6: Picky Captain
    public String pickyCaptain(int youFeet, int youInches, int friendFeet, int friendInches) {
        int youTotal = youFeet * 12 + youInches;
        int friendTotal = friendFeet * 12 + friendInches;

        if (youTotal >= 70 || friendTotal >= 70) {
            return "yes";
        }
        if (youTotal <= 69 || friendTotal <= 69) {
            return "no";
        }

        return "maybe";
    }

//    Method 7: Count Multiples
    public int countMultiples(int n) {
        if (n == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % n == 0) {
                count++;
            }
        }
        return count;
    }

//    Method 8: Club Formation
    public String[] formClub(String[] students,int n) {
        String[] club = new String[3];
        club[0] = students[n];

//        Vice President
        int vpIndex = n - 2;
        if (vpIndex < 0) {
            vpIndex = vpIndex + students.length;
        }
        club[1] = students[vpIndex];

//        Treasurer
        int treasIndex = (n % 3) % students.length;
        club[2] = students[treasIndex];

        return club;
    }

//    Method 9: Evil E
    public String evilE(String str) {
        int indexE = str.indexOf('E');

        if (indexE == -1) return str;

        char[] chars = str.toCharArray();

//        Check on the right side
        if (indexE < chars.length - 1) {
            char rightChar = chars[indexE + 1];
            if (rightChar != 'X' && rightChar != 'x') {
                chars[indexE + 1] = 'E';
                chars[indexE] = ' ';
                return Arrays.toString(chars);
            }
        }

//        Check on the left side
        if (indexE > 0) {
            char leftChar = chars[indexE - 1];
            if (leftChar != 'X' && leftChar != 'x') {
                chars[indexE - 1] = 'E';
                chars[indexE] = ' ';
                return Arrays.toString(chars);
            }
        }

//       When we reach here, the Evil E will be trapped in the middle.
//       Replace it with a space
        chars[indexE] = ' ';
        return Arrays.toString(chars);

    }

//    Bonus Qualification
    public boolean bonusQualified(double minimumAverage, Player[] players) {
        double sum = 0;

        for (int i = 0; i < players.length; i++) {
            sum = sum + players[i].getAverage();
        }

        double teamAverage = sum / players.length;
        return teamAverage >= minimumAverage;
    }
}
