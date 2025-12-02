public class Person {
//    Instance Variables
    private String name, location;

//    Constructor
    public Person (String argName) {
        name = argName;
        location = "HOME";
    }

//    Printing
    public String toString() {
        return name +" --- "+location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
