import java.util.Scanner;

public class LeagueDriver {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        Create Player Object
        SoccerPlayer player1 = new SoccerPlayer("Gustave", 19, "forward");
        BasketballPlayer player2 = new BasketballPlayer("Lebron James", 42, "Point Guard");

        int choice = 0;

        while (choice != 7) {
            System.out.println("---League Driver-----");
            System.out.println("1: Create Soccer Player");
            System.out.println("2: Create Basketball Player");
            System.out.println("3: Update Soccer Player (Add Goals + Assists)");
            System.out.println("4: Update Basketball Player (Add points+rebounds)");
            System.out.println("5: Show all information");
            System.out.println("6: Check performance");
            System.out.println("7: Exist");

            choice = Integer.parseInt(s.nextLine());

            switch (choice) {
                case 1:    // Create a soccer player
                    System.out.println("Enter name: ");
                    player1.setName(s.nextLine());
                    System.out.println("Enter age: ");
                    player1.setAge(Integer.parseInt(s.nextLine()));
                    System.out.println("Enter position: ");
                    player1.setPosition(s.nextLine());
                    break;

                case 2:    // Create a basketball player
                    System.out.println("Enter b player name:");
                    player2.setName(s.nextLine());
                    System.out.println("Enter b player age: ");
                    player2.setAge(Integer.parseInt(s.nextLine()));
                    System.out.println("Enter b player position: ");
                    player2.setPosition(s.nextLine());
                    break;

                case 3:    //update a soccer player
                    System.out.println("Add Goals");
                    player1.addGoals(Integer.parseInt(s.nextLine()));

                    System.out.println("Add assists");
                    player1.addAssists(Integer.parseInt(s.nextLine()));
                    break;

                case 4:  // update a basketball player
                    System.out.println("Add rebounds");
                    player2.addRebounds(Integer.parseInt(s.nextLine()));

                    System.out.println("Add Points");
                    player2.addPoints(Integer.parseInt(s.nextLine()));
                    break;

                case 5:  // Show all information
                    System.out.println(player1);
                    System.out.println(player2);
                    break;

                case 6:   // check player performance
                    System.out.println(player1.checkPerformance());
                    System.out.println(player2.checkPerformance());
                    break;


                case 7:   // Player existence
                    s.close();
                    break;
                default:
                    System.out.println("Wrong number");
                    break;
            }

        }
    }
}