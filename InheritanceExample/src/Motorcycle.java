public class Motorcycle extends MotorVehicle {
    //    Constructor (overrides parent)
    public Motorcycle() {
//        The parent's constructor runs first (automatically
//        Then, this constructor runs
        capacity = 2;
        passengers = new Person[capacity];
        name = "";
    }

}
