
public class Operators {
    public static void main(String[] args) {
        int a = 5;
        double b = a;

        System.out.println(b);

//        This causes a compile error. Possible lossy conversion from double to int
//        double x = 6.5;
//        int y = x;
//        System.out.println(y);

        double m = 8;
        int n = (int) m;
        System.out.println(n);

    }
}
