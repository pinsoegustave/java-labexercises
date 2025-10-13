
public class SoccerPlayer extends Player{

    public int goals;
    public int assists;

//  Constructor
    public SoccerPlayer (String name, int age, String position) {

    }

    public void addGoals( int goal) {
        goals += goal;
    }

    public void addAssists(int assist) {
        assists += assist;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }



    public String checkPerformance() {
        if (goals > 5) {
            return getName() + " need more practice";
        }
        else{
            return getName() + "Great work";
        }

//        return "";
    }

    public String toString() {
        return "Name: "+getName()+" age "+getAge()+" Position "+ getPosition() + " has "+getGoals()+" goals with "+ getAssists()+ " assists";
    }
}
