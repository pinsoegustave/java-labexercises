import java.util.Scanner;

public class CrayonDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CrayonColor firstColor = getValidColor(scanner, "first");
        CrayonColor secondColor = getValidColor(scanner, "second");

        compareColors(firstColor, secondColor);

        scanner.close();
    }

    public static CrayonColor getValidColor(Scanner scanner, String colorNumber) {
        CrayonColor color = null;

        while (color == null) {
            System.out.print("Enter " + colorNumber + " color: ");
            String input = scanner.nextLine().trim().toUpperCase();

            try {
                color = CrayonColor.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid color! Try again.");
            }
        }

        return color;
    }

    private static void compareColors(CrayonColor color1, CrayonColor color2) {
        if (color1.ordinal() < color2.ordinal()) {
            System.out.println("Answer: " + color1 + " is lighter than " + color2);
        } else if (color1.ordinal() > color2.ordinal()) {
            System.out.println("Answer: " + color1 + " is darker than " + color2);
        } else {
            System.out.println("Answer: Both colors are the same (" + color1 + ")");
        }
    }
}
