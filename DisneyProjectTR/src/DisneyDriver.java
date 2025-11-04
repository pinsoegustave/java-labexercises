
public class DisneyDriver {
    public static void main(String[] args) {

//        Create 5 guests
        Guest[] guests = new Guest[5];
        guests[0] = new Guest("Alice");
        guests[1] = new Guest("Bob");
        guests[2] = new Guest("Carol");
        guests[3] = new Guest("Doug");
        guests[4] = new Guest("Ernesto");


//        Create 5 characters
        DisneyCharacter[] dc = new DisneyCharacter[5];
        dc[0] = new DisneyCharacter("Mickey");
        dc[1] = new DisneyCharacter("Money");
        dc[2] = new DisneyCharacter("Donald");
        dc[3] = new DisneyCharacter("Goofy");
        dc[4] = new DisneyCharacter("Pluto");

//        Tell each guest to walk around the park 5 times
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < guests.length; j++) {
                guests[j].visitAllCharacters(dc);
            }
        }

//        Display all guests
        for (int i = 0; i < guests.length; i++) {
            System.out.println(guests[i]);
        }
    }
}