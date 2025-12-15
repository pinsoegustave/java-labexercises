public class Lesson5 {

    public static void main(String[] args) {

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i);

            if (i % 3 == 0) {
                System.out.print(" (multiple of 3)");
            }

            System.out.println();
        }

    }
}
