import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES
        Scanner scanner =  new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock" , "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        // GET CHOICE FROM THE USER
        do{
            System.out.print("Enter your Rock Paper or Scissors: ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("INVALID INPUT");
                continue;
            }

            // GET RANDOM CHOICE FOR THE COMPUTER
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice: " + computerChoice);

            // CHECK WIN CONDITIONS
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You Win");
            } else {
                System.out.println("Comp wins");
            }

            // ASK TO PLAY AGAIN?
            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while (playAgain.equals("yes"));


        //GOODBYE MESSAGE
        System.out.println("+++++++++++++++++++++");
        System.out.println("Thanks for Playing");
        System.out.println("+++++++++++++++++++++");
        scanner.close();
    }
}
