public class MotorVehicle extends Vehicle {

//    Instance variable
    protected String state;

//    Constructor
    public MotorVehicle() {
//        The parent's constructor runs first
        state = "OFF";
    }

//    This starts the vehicle
    public void start() {
        if (state.equals("ON")) {
            System.out.println("The "+ name + "is already on");
            return;
        }

//        Turn it on
        state = "ON";
        System.out.println("The " + name+ " is now on");
    }
    //    This starts the vehicle
    public void stop() {
        if (state.equals("OFF")) {
            System.out.println("The "+ name + "is already off");
            return;
        }

//        Turn it on
        state = "OFF";
        System.out.println("The " + name+ " is now off");
    }
}
