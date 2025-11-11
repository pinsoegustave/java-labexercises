public class Exercises {
    public static void main(String[] args) {

//        Question 1:
        String tvShow = new String("American Idol");
        String movie = new String("Rise of the Planet of the Apes");
        String movie2 = new String("The Color of Money");

        int length;
        int position;
        char letter;
        String tmp;

        length = tvShow.length();
        System.out.println(length);
        letter = tvShow.charAt(4);
        System.out.println(letter);
        letter = tvShow.charAt(8);
        System.out.println(letter);
        position = tvShow.indexOf("can");
        System.out.println(position);
        tmp = tvShow.substring(7);
        System.out.println(tmp);
        tmp = tvShow.substring(6, 10);
        System.out.println(tmp);
        length = movie.length();
        System.out.println(length);
        length = movie2.length();
        letter = movie2.charAt(11);
        System.out.println(letter);
        tmp = movie2.substring(10);
        System.out.println(tmp);
        position = movie.indexOf("the");
        System.out.println(position);
        position = movie.indexOf("p");
        System.out.println(position);
        tmp = movie.substring(10);
        System.out.println(tmp);
        letter = movie2.charAt(0);
        System.out.println(letter);
        tmp = movie.substring(8, 15);
        System.out.println(tmp);
        position = movie2.indexOf("Color");
        System.out.println(position);
        tmp = movie2.substring(8, 15);
        System.out.println(tmp);
        position = movie.indexOf("Money");
        System.out.println(position);

//        Question 2:
        StringsPractice him = new StringsPractice();

        String result = him.beginToEnd("Excessive");
        String second = him.endToBring("Characters");

        System.out.println(result);
        System.out.println(second);
    }
}
