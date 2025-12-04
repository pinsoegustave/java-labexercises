public class Bus extends MotorVehicle{
    //    Constructor (overrides parent)
    public Bus() {
//        The parent's constructor runs first (automatically
//        Then, this constructor runs
        capacity = 10;
        passengers = new Person[capacity];
        name= "Mystery Machine";
    }

    //    This overrides the parent's method
    public String toString() {
        return "Bus: " + super.toString();
    }
}
