
public class Lesson11 {

    enum Scores { EAGLE, BIRDIE, PAR, BOGEY, DOUBLE_BOUGEY }

    public static void main(String[] args) {

        Scores[] golfScores = {
                Scores.BIRDIE,
                Scores.BOGEY,
                Scores.EAGLE,
                Scores.PAR,
                Scores.DOUBLE_BOUGEY
        };

        for (Scores score: golfScores) {
            System.out.println(score);
        }

    }
}
