
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
}
