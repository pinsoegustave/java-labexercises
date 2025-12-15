public class Lesson10 {

    public static void main(String[] args) {

        int count = 0;

        String str = "hello";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
