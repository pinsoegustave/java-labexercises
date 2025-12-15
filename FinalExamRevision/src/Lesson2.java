import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int x, y;
        String z = "3";
        x = 6;
        y = 4;
        double m = 56.83;
        int v = 32;
        String name = "Gustave";

//        System.out.println(x);
//        System.out.println("x"); // Prints x as a message
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(x + y);   // Adds x and y, returns answer
//        System.out.println(y + z);   // Joins y and z, z is a string so, answer = 43
//        System.out.println(y + "x");  // Concatenates int with string, answer = 4x
//
//        System.out.printf("%5d", v);
//        System.out.println();
//        System.out.printf("%12s", name);

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String knight = s.nextLine();
        System.out.println(knight);

        System.out.println("Please enter your age: ");
        String getAge = s.nextLine();
        int age = Integer.parseInt(getAge);
        System.out.println(age);
    }
}
