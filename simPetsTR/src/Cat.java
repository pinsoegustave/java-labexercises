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

//    Method to get number of lives remaining
    public int getNumLives() {
        return numLives;
    }

//    Getting our cat to talk
    public void talk() {
        //            Make sure the cat is alive
        if (numLives == 0 ) {
            System.out.println(name+": I am dead, I can't talk");
            return;
        } else {
            System.out.println("Meowing!!");
        }
    }

//    This will give a bone to the dog
    public void giveBone (Dog argDog) {
//         Make sure the cat is alive
        if (numLives == 0 ) {
            System.out.println(name+": I can't give bone, am dead!!");
            return;
        }
        System.out.println(name + ": I am giving a bone to "+ argDog.getName());
//        Create a new bone
        Bone newBone = new Bone();

//        Give the bone to the dog
        boolean result = argDog.receiveBone(newBone);

//        Gain a life
        if (result && numLives < 9) numLives++;


    }
//    This simulates a cat stealing a bone from Dog
    public void stealBone(Dog argDog) {
        if (numLives >= 0) {
            System.out.println(name+ ": I have stolen a bone from "+argDog);
            return;
        }
    }

    //        This simulates someone bitting the cat
    public void getBitten() {
//            Make sure the cat is alive
        if (numLives == 0 ) {
            System.out.println(name+": I didn't feel that coz I am an ex-cat");
            return;
        }
        System.out.println(name +": Meeeoooowch!!! I was just bitten");
        numLives--;
    }

    //        This causes the cat to annoy the passed in dog
    public void annoyDog(Dog argDog) {
        if (numLives == 0) {
            System.out.println(name+ ": I can't annoy a dog because I am dead");
            return;
        }

        System.out.println(name+": I am annoying "+ argDog.getName());
        argDog.getAnnoyed(this);
    }

    public void look() {
        System.out.println("You see a cat named "+name);
    }

    public void examine() {
        System.out.println("My name is "+name+" and I have "+numLives+" lives");
    }
}
