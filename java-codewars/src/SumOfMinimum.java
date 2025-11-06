import java.util.Arrays;

public class SumOfMinimum {
    public static void main(String[] args) {
        int[][] arr = {{90, 43, 23, 5}, {12, 4, 67, 48}, {8, 21, 87, 32 }};

        Arrays.sort(arr);

        for (int x = 0; x < arr.length; x++) {

            for (int y = 0; y < arr.length; y++) {
                System.out.println(arr[x][y]);
            }
        }

    }
}
