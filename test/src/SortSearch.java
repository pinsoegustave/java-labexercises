import java.util.Arrays;

public class SortSearch {
    public static void main(String[] args) {

        int[] myNumbers = new int[10];

        myNumbers[0] = 34;
        myNumbers[1] = 23;
        myNumbers[2] = 45;
        myNumbers[3] = 90;
        myNumbers[4] = 93;
        myNumbers[5] = 45;
        myNumbers[6] = 28;
        myNumbers[7] = 55;
        myNumbers[8] = 39;
        myNumbers[9] = 79;

//        display without for loop
//        System.out.println(myNumbers);   This prints the memory address of the whole array.

        Arrays.sort(myNumbers);

        for (int x = 0; x <= myNumbers.length-1; x++) {

//            System.out.println(myNumbers[x]);
            if (myNumbers[x] > 28) {
                System.out.println("yes there is an equal value");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
