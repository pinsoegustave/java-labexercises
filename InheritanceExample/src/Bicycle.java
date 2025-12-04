public class Bicycle extends Vehicle {
    //    Constructor (overrides parent)
    public Bicycle () {
//        The parent's constructor runs first
        name = "Schwin";
    }
//    This overrides the parent's method
    public String toString() {
        return "Bicycle: " + super.toString();
    }
}
