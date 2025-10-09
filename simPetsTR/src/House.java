import java.util.Scanner;

public class House {
    public static void main(String[] args) {
//          Create the objects
        Cat player = new Cat("Garfield");
        Dog snoppy = new Dog("Snoppy");
        Dog simba = new Dog("Simba");


//        Welcome
        System.out.println("Welcome to SimPets. You are a cat ");

//        Main loop
        boolean contineGame = true;
        Scanner s = new Scanner(System.in);
        String enteredCommand;

        while (contineGame) {
//            Prompt
            System.out.println("Please enter a command");
            enteredCommand = s.nextLine();

//            Process the command
            if (enteredCommand.equals("quit")) {
                contineGame = false;
            } else if (enteredCommand.equals("look")) {
                player.look();
                snoppy.look();
                simba.look();
            } else if (enteredCommand.equals("examine garfield")) {
                player.examine();
            } else if (enteredCommand.equals("examine snoopy")) {
                snoppy.examine();
            } else if (enteredCommand.equals("examine simba")) {
                simba.examine();
            } else if (enteredCommand.equals("talk")) {
                player.talk();
            } else if (enteredCommand.equals("annoy snoppy")) {
                player.annoyDog(snoppy);
            } else if (enteredCommand.equals("annoy simba")) {
                player.annoyDog(simba);
            } else if (enteredCommand.equals("give bone to snoppy")) {
                player.giveBone(snoppy);
            } else if (enteredCommand.equals("give bone to simba")) {
                player.giveBone(simba);
            } else if (enteredCommand.equals("steal bone from snoopy")) {
                player.stealBone(snoppy);
            } else if (enteredCommand.equals("steal bone from simba")) {
                player.stealBone(simba);
            }
            else {
                System.out.println("Invalid command");
            }

//            Each dog should chew their bone at the end of a turn
            snoppy.chew();
            simba.chew();


//            Check for a loss
            if (player.getNumLives() == 0) {
                System.out.println("You have run out of lives");
                System.out.println("RIP Garfield");
                contineGame = false;
            }
        }
//        End of main loop

//        Goodbye message
        System.out.println("Thanks for playing with us!!");
    }


}