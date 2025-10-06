public class BasketballPlayer extends Player {

    public int points;
    public int rebounds;

//    Constructor
    public BasketballPlayer(String name, int age, String position) {

    }

    public void addPoints(int p) {
        p++;
    }

    public void addRebounds(int r) {
        r++;
    }

    public int getPoints() {
        return points;
    }

    public int getRebounds() {
        return rebounds;
    }

    public String toString() {
        return "This player "+getName()+" has "+points+" points with"+rebounds+" rebounds";
    }

    public String checkPerformance() {
        if (points < 20) {
            return getName()+" needs more practice";
        }

        return "";
    }

}
