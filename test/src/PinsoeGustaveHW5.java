import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PinsoeGustaveHW5 {
    public static void main(String[] args) {
        Scanner inputStream = null;
        Scanner inputStream2 = null;

        try {
//            inputStream = new Scanner(new FileInputStream("sports.txt"));
            inputStream = new Scanner(new FileInputStream("played.txt"));

        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening file");
            System.exit(1);
        }

        String input;
        while (inputStream.hasNextLine()) {
            input = inputStream.nextLine();
            System.out.println(input);
        }

        inputStream.close();
    }
}
