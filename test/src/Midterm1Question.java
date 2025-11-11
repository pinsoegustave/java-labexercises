import java.util.Scanner;

public class Midterm1Question {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean result = false;
        int numTries = 0;

        while (!result) {
            System.out.println("What is the capital of Pennsylvania?");
            String city = s.nextLine();

            if (city.equals("Harrisburg")) {
                System.out.println("Correct");
                result = true;
            }
            numTries++;
            System.out.println("Number of tries: "+ numTries);
        }

        s.close();
    }
}
