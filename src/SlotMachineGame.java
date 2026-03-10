import java.util.Random;
import java.util.Scanner;

public class SlotMachineGame {
    static void main(String[] args) {

        // JAVA SLOT MACHINE

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // DISPLAY WELCOME MESSAGE
        System.out.println("Welcome to Java Slot");
        System.out.println("Symbols: 😭❤️🎶✌️🤷‍♂️");

        // PLAY IF BALANCE > 0
        while (balance > 0){

            //ENTER BET AMOUNT
            System.out.println("Current Balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //        VERIFY IF BET > BALANCE
            if (bet > balance){
                System.out.println("Not enough money");
                continue;
            }
            else if (bet <= 0) {
                // VERIFY IF BET > 0
                System.out.println("Bet > Zero");
                continue;
            }
            else {
                //        SUBTRACT BET FROM BALANCE
                balance -= bet;
                System.out.println("$" + balance);

                System.out.println("Spinning...");
                // SPIN ROW
                row = spinRow();

                // PRINT ROW
                printRow(row);

                // GET PAYOUT
                payout = getPayout(row, bet);
                if (payout > 0){
                    System.out.println("You won $" + payout);
                    balance += payout;
                }
                else {
                    System.out.println("You lost this round");
                }
                // ASK TO PLAY AGAIN
                System.out.print("Want to play again? (Y/N): ");
                playAgain = scanner.nextLine().toUpperCase();

                if (!playAgain.equals("Y")){
                    break;
                }

            }


        }
        // DISPLAY EXIT MESSAGE
        System.out.println("Thanks for ! Final Balance is $" + balance);
        scanner.close();
    }
    static String[] spinRow(){

        String[] symbols = {"😭","❤️","🎶","✌️","🤷‍♂️‍"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println(" " + String.join(" | ", row));
    }
    static int getPayout( String[] row, int bet){

        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "😭" -> bet * 3;
                case "❤️" -> bet * 4;
                case "🎶" -> bet * 5;
                case "✌️" -> bet * 10;
                case "🤷‍♂️" -> bet * 20;
                default -> 0;
            };
        }
        else if (row[0].equals(row[1])){
            return switch (row[0]){
                case "😭" -> bet * 3;
                case "❤️" -> bet * 4;
                case "🎶" -> bet * 5;
                case "✌️" -> bet * 10;
                case "🤷‍♂️" -> bet * 20;
                default -> 0;
            };
        }
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "😭" -> bet * 3;
                case "❤️" -> bet * 4;
                case "🎶" -> bet * 5;
                case "✌️" -> bet * 10;
                case "🤷‍♂️" -> bet * 20;
                default -> 0;
            };
        }
        return 0;
    }
}
