public class Animal {
//    Instance variables
    String type;

//    Constructor
    public Animal() {
        setType();
    }

//    This sets the type of the animal
//    The child classes should override the parent
    public void setType() {
        type = "unknown";
    }

//    Print method
    public String toString() {
        return type;
    }
}
