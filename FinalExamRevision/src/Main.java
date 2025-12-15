import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

//        int minute = 299;
//        double answer = (double) minute / 60;
//        System.out.println(answer);

        int a = 12;
//        int b = 6   This is compiled (syntax) error
        int b = 6;
        int c = 0;
         int d = a - b;
        double e = a / c;

//        System.out.println("a + b = "+ d); (Logic error) According to the message, the expected answer is not what u will get.
        System.out.println("a + b = "+ d);
//        System.out.println("a / c = "+ e ); (Runtime error) Dividing by 0 is not a correct math operation
        System.out.println("a / c = "+ e );
    }
}