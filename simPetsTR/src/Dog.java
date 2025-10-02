import java.util.Random;

public class Dog {
//    Instance variables
    private String name;
    private Boolean hasBone;
    private Bone bone;

    public Dog(String argName) {
        name = argName;
        hasBone = false;
        bone = null;
    }

    public String toString() {
        String display = name + " - "+ hasBone+" - "+ bone;
        return display;
    }

//    Getters
    public String getName() {
        return name;
    }

//    This causes the dog to talk
    public void talk() {
        System.out.println(name + " Woof!!!");
    }

//    This takes the new bone being given to us,
//    and accepts it (if we don't already have)
//    This returns true if the dog accepts the bone
//    returns false if it doesn't
    public boolean receiveBone(Bone argBone) {
//        See if we already have a bone
        if (hasBone) {
            System.out.println(name+": Thanks, but I already have one!");
            return false;
        }
//        If we get here, the doesn't have one, Accept it
        hasBone = true;
        bone = argBone;
        System.out.println(name + ": Thanks for the bone");

        return false;
    }
    public void chew() {
        if (hasBone) {
//            Tell the bone it is being chewed
            bone.getChewed();
            System.out.println(name+": munch much....");

//            See if the bone is all chewed up
            if (bone.getLength() == 0) {
                hasBone = false;
                bone = null;
            }
        }
    }
//    This simulates the dog bitting the cat
    public void biteCat(Cat argCat) {
        System.out.println(name+": I am bitting "+ argCat.getArgName());
        argCat.getBitten();
    }

    public void boneGetsStolen(Cat argCat) {
//        Make sure the dog has a bone to steal
        if (!hasBone) {
            System.out.println(name+ ": I don't have a bone to give");
            return;
        }

//        50-50 chance of success
        Random r = new Random();
        int chance = r.nextInt(1, 101);
        if (chance > 50) {
//            Success
            hasBone = false;
            bone = null;
            System.out.println(name+ ": I just had my bone stolen");
        } else {
//            Failure
            System.out.println(name+": I just caught "+argCat.getArgName()+ "Tryigng to check on me");
        }

    }
}
