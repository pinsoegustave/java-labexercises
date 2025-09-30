public class Bone {
//    Instance Variables
    private int length;

//    Constructor
    public Bone (){
//        All bones start at 4 inches long
        length = 4;
    }

    public String toString() {
        String display = "Bone - " + length;

        return display;
    }

    public int getLength() {
        return length;
    }

//    This simulates an animal chewing on this bone
    public void getChewed() {
        length--;
    }

}
