public class Vehicle {
//    Instance Variables
    protected Person[] passengers;
    protected int capacity;
    protected String location;
    protected String name;

//    Constructor
    public Vehicle() {
        location = "HOME";
        capacity = 1;
        passengers = new Person[capacity];
        name = "no name";
    }

//    Printing
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
            System.out.println(argPerson.getName() + "Can't get into the "+ name +" because there is no room! ");
            return;
        }

//        Find an empty seat

    }

//    This removes the person from the vehicle
    public void getOut(Person argPerson) {
//        Find the person in the vehicle
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].getName().equals(argPerson.getName())) {
//                Found the person. Remove them
                passengers[i] = null;
                System.out.println(argPerson.getName() + "is now out of the "+ name);
                return;
            }
        }
//        If we get here, the person was not found
        System.out.println(argPerson.getName() + "is not in the "+ name);
    }
}
