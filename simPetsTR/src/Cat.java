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

//    This will give a bone to the dog
    public void giveBone (Dog argDog) {
        System.out.println(name + ": I am giving a bone to "+ argDog.getName());
//        Create a new bone
        Bone newBone = new Bone();

//        Give the bone to the dog
        boolean result = argDog.receiveBone(newBone);

//        Gain a life
        if (result && numLives < 9) numLives++;

    }
}
