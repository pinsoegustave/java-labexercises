public class Lesson4 {
    public static void main(String[] args) {

        int x = 4;
        int y = 1;

        if (x < y) {
            x += 2;
            y -= x;
        } else {
            x--;
            y++;
        }

        if (x % 2 == 0) {
            x *= y;
        } else if (y % 2 == 0) {
            y *= x;
        }

        if (x > y) {
            x /= 2;
        }

        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
    }
}
