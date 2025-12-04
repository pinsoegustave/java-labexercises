public class Car extends MotorVehicle {
//    Constructor (overrides parent)
    public Car() {
//        The parent's constructor runs first (automatically
//        Then, this constructor runs
        capacity = 4;
        passengers = new Person[capacity];
        name = "DeLorean";
    }

}
