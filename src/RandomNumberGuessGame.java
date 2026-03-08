import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessGame {
    static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1);


        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number btw %d-%d\n",min,max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess<randomNumber) {
                System.out.println("Guess is too low");
            }
            else if (guess > randomNumber){
                System.out.println("Guess is to high");
            }
            else {
                System.out.printf("Your guess is %d and the random number is %d\n", guess ,randomNumber);
                System.out.printf("You took %d number of attempts", attempts);
            }
        }while (guess != randomNumber);

        scanner.close();
    }
}
