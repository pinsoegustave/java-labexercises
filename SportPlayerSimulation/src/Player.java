public class Player {
//       Attributes
        private String name;
        private int age;
        private String position;

//        Constructor
    public Player() {

    }
//    Function to print name of players
    public Player (String name, int age, String position) {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String toString() {
//        return name, age, and position
        return "name: "+ name+ " age: "+age+" position: "+ position;
    }
}
