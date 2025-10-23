import java.util.Random;

public class DisneyCharacter {
//    Instance variable
    private String name;

//    Constructor
    public DisneyCharacter(String argName) {
        name = argName;
    }

//    The speed in guest is visiting us
    public void visitMe(Guest argGuest) {
//    Say Hi
        System.out.println("hi, "+ argGuest.getName() + ". My name is "+ name);

//        20% chance of giving of a pin
        Random r = new Random();
        int chance = r.nextInt(1, 101);
        if (chance <= 20) {
            argGuest.acceptPin(name);
        }

//        30% chance of giving a balloon
        chance = r.nextInt(1, 101);
        if (chance <= 30) {
            argGuest.acceptBallon();
        }
    }
}
