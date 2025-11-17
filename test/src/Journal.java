import java.io.*;
import java.util.Scanner;

public class Journal {
    // Create a filename for the journal
// Example: FILE_NAME = "YourName_Journal.txt";
    public static String FileName = "Gustave_Journal.txt";

    public static void main(String[] args) {
// TODO 1: Check if the journal file exists.
//If not, create it using try-catch.
// Hint: Use File and createNewFile().
        File myFile = new File(FileName);
        if (!myFile.exists()) {
            System.out.println("Your journal file doesn't exist.... Creating one");

            try {
                myFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Error occurred");
                System.exit(1);
            }
        }

        Scanner entry = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = 0;

        while (choice != 4) {
            System.out.println("1: Write a new entry");
            System.out.println("2: View all entries");
            System.out.println("3: Delete an entry");
            System.out.println("4: Quit");
            choice = Integer.parseInt(entry.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter your daily journal: ");
                    String text = entry.nextLine();
                    writeEntry(text);
                    break;
                case 2:
                    viewJournal();
                    break;
                case 3:
                    System.out.println("What number do you want to delete");
                    int deleteNum = Integer.parseInt(entry.nextLine());
                    deleteEntry(deleteNum);
                    break;

                case 4:
                    System.out.println("Good bye");
                    entry.close();
                    break;

                default:
                    System.out.println("Wrong choice buddy!!");
            }
        }
// TODO 2: Implement the main menu
// Steps:
// 1. Display options to the user:
// 1 - Write a new entry (writeEntry method)
// 2 - View all entries (viewJournal method)
// 3 - Delete an entry (deleteEntry method)
// 4 - Quit
// 2. Use a loop to repeatedly ask the user for their choice
// 3. Call the corresponding method based on the user's selection
    }

    public static void writeEntry(String text) {
// TODO:
// 1. Determine the next entry number using getNextNumber()
// 2. Format the entry number with leading zeros
// Hint: String.format("%03d", nextNum)
// 3. Format the entry as "001: Your text here"
// 4. Open the journal file for writing
// 5. Write the formatted entry to a new line in the file
// 6. Use try-catch to handle any IOExceptions
        try {
            int number = getNextNumber();
            String formatNumber = String.format("%03d", number);
            String entry = formatNumber+":"+text;

            PrintWriter outputStream = new PrintWriter(new FileOutputStream(FileName), true);
            outputStream.println(entry);
            outputStream.close();
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
    }

    public static void viewJournal() {
// TODO:
// 1. Open the journal file for reading
// 2. Read each line and print it to the console
// 3. Handle the case when the journal is empty
// 4. Use try-catch to handle any IOExceptions
        try {
            Scanner in = new Scanner(new FileInputStream(FileName));

            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }
            in.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteEntry(int num) {
// TODO:
// 1. Ask the user for the entry number to delete
// 2. Open the original journal file for reading
// 3. Open a temporary file for writing
// 4. Copy all lines except the one matching the entry number
// Hint: Use line.substring(0,3) to check the entry number
// 8. Inform the user that the entry has been deleted
// 9. Use try-catch to handle any IOExceptions
        File originalFile = new File(FileName);
        File TempFile = new File("tempJournal.txt");

        try {
//            Read from the original file
            Scanner in = new Scanner(originalFile);
//            Write to the temp file
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(TempFile), true);

            while (in.hasNextLine()) {
//                Read each line in our journal
                String line = in.nextLine();
                String numberPart = line.substring(0, 3);
                if (!numberPart.equals(String.format("%03d", num))) {
                    outputStream.println(line);
                }
            }
            in.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int getNextNumber() {
// TODO:
// 1. Open the journal file for reading
// 2. Read through all lines to find the last entry
// 3. Extract the number from the last line (first 3 characters)
// 4. Return the next number (last number + 1)
// 5. If the file is empty, return 1
        int num = 1;

        try {
            Scanner in = new Scanner(new FileInputStream(FileName));
            String LastLine= " ";

            while (in.hasNextLine()) {
                LastLine = in.nextLine();
            }
            if (!LastLine.equals(" ")) {
                String numberPart = LastLine.substring(0, 3);
                num = Integer.parseInt(numberPart)+1;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return num; // Placeholder
    }
}
