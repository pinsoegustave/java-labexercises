public class Cat {
//    Instance variables
    private String name;
    private int numLives;

//    Constructor
    public Cat(String argName) {
//        Giving my cat values
        name = argName;
        numLives = 9;  // All cats start with 9 lives
    }

//    Printing
    public String toString() {
        String display = name + " - " + numLives;

        return display;
    }

//    Getters
    public String getArgName() {
        return name;
    }

//    Getting our cat to talk
    public void talk() {
        System.out.println("Meowing!!");
    }
}
