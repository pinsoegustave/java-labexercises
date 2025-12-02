public class RecursionExamples {

    public static int factorial(int n) {
//        Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int sum (int n) {
//        Base case
        if (n <= 1) {
            return 1;
        }

        return n + sum(n - 1);
    }
}
