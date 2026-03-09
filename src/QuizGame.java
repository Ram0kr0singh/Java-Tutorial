import java.util.Scanner;

public class QuizGame {
    static void main(String[] args) {
        // JAVA QUIZ

        // QUESTIONS array[]
        String[] questions = {
                "1. Java is a ______ language",
                "2. Which method is the entry point of a Java program?",
                "3. Which keyword is used to create an object in Java?",
                "4. Which of these is a primitive data type in Java?",
                "5. Which loop is guaranteed to run at least once?",
        };
        // OPTIONS array [][]
        String[][] options = {
                {"(1) Procedural","(2) Object-Oriented","(3) Assembly","(4) Machine"},
                {"(1) start()","(2) run()","(3) main()","(4) init()"},
                {"(1) class","(2) this","(3) new","(4) create"},
                {"(1) String","(2) Array","(3) Object","(4) int"},
                {"(1) for loop","(2) while loop","(3) do-while loop","(4) enhanced for loop"},
        };
        // DECLARE VARIABLES
        int[] answers = {2,3,3,4,3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        // WELCOME MESSAGE
        System.out.println("********************");
        System.out.println("Welcome to JAVA QUIZ");
        System.out.println("********************");
        // QUESTION (loop)

        for (int i =0; i < questions.length; i++){
            System.out.println(questions[i]);

            //      OPTIONS
            for (String option : options[i]){
                System.out.println(option);
            }

            //      GET GUESS FROM USER
            System.out.print("ENTER YOUR GUESS: ");
            guess = scanner.nextInt();

            //      CHECK OUR GUESS
            if (guess == answers[i]){
                System. out.println(" ******** ") ;
                System. out.println ("CORRECT!");
                System. out.println(" ******** ") ;
                score++;
            }
            else{
                System. out.println(" ******** ") ;
                System. out.println (" WRONG! ");
                System. out.println(" ******** ") ;
            }
        }
        // DISPLAY FINAL SCORE
        System.out.println("____________________________________");
        System.out.printf("Yay Your scored %d out of 5\n", score);
        System.out.println("____________________________________");
        scanner.close();
    }
}
