
public class House {
    public static void main(String[] args) {
//          Create the objects
        Cat cat1 = new Cat("Whiskers");
        Cat cat2 = new Cat("Garfield");

        System.out.println(cat1.getArgName());
        System.out.println(cat2);

        cat2.talk();
        cat1.talk();
        cat2.talk();

//        Bone bone  = new Bone();
//        System.out.println(bone);
//
//        bone.getChewed();
//        bone.getChewed();
//
////        Display the objects
//        System.out.println(bone);
    }


}