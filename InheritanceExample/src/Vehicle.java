public class Vehicle {
//    Instance Variables
    protected Person[] passengers;
    protected int capacity;
    protected String location;

//    Constructor
    public Vehicle() {
        location = "HOME";
        capacity = 1;
        passengers = new Person[capacity];
    }

    public String toString() {
//        Count the number of people in this vehicle
        int numPassengers = 0;
        for (Person p : passengers) {
            if (p != null) numPassengers++;
        }

        String display = "Location: "+ location;
        display += "- # Passengers: "+ numPassengers + "/" + capacity;

        return display;
    }

    public void getIn (Person argPerson) {
        if (!location.equals(argPerson.getLocation())) {
            System.out.println(argPerson.getName() + "Can't get in ");
            return;
        }
    }
}
