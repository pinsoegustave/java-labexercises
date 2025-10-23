public class Guest {
//    Instance variable
    private String name;
    private int numBalloons;
    private String[] pins;

//    Constructor
    public Guest (String argName) {
        name = argName;
        numBalloons = 0;
        pins = new String[5];
    }

//    Printing
    public String toString() {
        String display = name;
        display += "\n\tNum Balloons: "+ numBalloons;
        display += "\n\tPins: ";

        for (int i = 0; i < pins.length; i++) {
            if (pins[i] != null) display += "\n\t\t" + pins[i];
        }
        return display;
    }

//   The guest was just given a ballon
    public void acceptBallon() {
        numBalloons++;
    }

//    The guest was just given a pin
    public void acceptPin(String argPin) {
        for (int i = 0; i < pins.length; i++) {
            if (pins[i] == null) {
//                Put the pin into this position
                pins[i] = argPin;
                return;
            }
        }
    }

//    Getter
    public String getName() {
        return name;
    }

//    This walks around the park
    public void visitAllCharacters(DisneyCharacter[] dc) {
        for (int i = 0; i < dc.length; i++) {
            dc[i].visitMe(this);
        }
    }
}
