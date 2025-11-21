import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PinsoeGustaveHW5 {
    public static void main(String[] args) {

        String[] sports = null;
        int[] playedCounts = null;

        Scanner inputStream = null;

        try {
            File sportsFile = new File("sports.txt");
            Scanner outputStream = new Scanner(sportsFile);

//            Read the number of sports in the file
            int numSports = Integer.parseInt(outputStream.nextLine());
            outputStream = new Scanner(new FileInputStream("played.txt"));
            sports = new String[numSports];

//            Read each sport name
            for (int i = 0; i < numSports; i++) {
                sports[i] = outputStream.nextLine();
            }
            outputStream.close();

            playedCounts = new int[numSports];
        }
        catch (FileNotFoundException e) {
            System.out.println("Error reading file");
            System.exit(1);
        }

//        Read the player.txt file
        try {
            File playedFile = new File("played.txt");
            Scanner outputStream = new Scanner(playedFile);

//            Read each sport and count occurrences
            while(outputStream.hasNextLine()) {
                String sport = outputStream.nextLine().trim();

                for (int i = 0; i < sports.length; i++) {
                    if (sports[i].equals(sport))  {
                        playedCounts[i]++;
                        break;
                    }
                }
            }
            outputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error reading file");
            System.exit(1);
        }

//        Display results
        for (int x = 0; x < sports.length; x++) {
            System.out.println(sports[x] + ": "+ playedCounts[x]);
        }

    }
}
