import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        int m = 2 + 5 * 4 - (3 + 2);
        System.out.println(m);

        int x = 5;
        int y = 3;

//        x + 1 = 6;   This is an error because there is no variable declared
//        x = 17 + 1;  // This overrides the value of x and changes to the answer of 17 + 1;
//        x = y;  This changes the value of x to the value of y
//        x = y + 1; This changes the value of x to the answer of y + 1
        x = x + 1;   // Adds 1 to the value of x

        System.out.println(x);
    }
}