
public class House {
    public static void main(String[] args) {
//          Create the objects
        Bone bone  = new Bone();
        System.out.println(bone);


        Cat cat1 = new Cat("Whiskers");
        Cat cat2 = new Cat("Garfield");

        Dog d1 = new Dog("Snoopy");
        Dog d2 = new Dog("Larry");

        System.out.println(d1);
        System.out.println(d2);
        d2.talk();
        d1.talk();

        d1.receiveBone(bone);

        cat2.talk();
        cat1.talk();
        cat2.talk();

//
//        bone.getChewed();
//        bone.getChewed();
//
////        Display the objects
//        System.out.println(bone);
    }


}