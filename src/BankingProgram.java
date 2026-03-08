import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in); //one scanner for entire program (staic cuz used in static)

    static void main(String[] args) {

    //JAVA BANKING PROGRAM FOR BEGINNERS

        // Declare Variable
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){


        // DISPLAY MENU
        System.out.println("***************");
        System.out.println("Banking Program");
        System.out.println("***************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. EXIT");
        System.out.println("***************");
        // GET AND PROCESS USERS CHOICE
        System.out.print("Enter your Choice (1-4): ");
        choice = scanner.nextInt();

        switch (choice){
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("Enter a valid choice");
        }

        }
        // showBalance ()
        // deposit()
        // withdraw()
        // EXIT MESSAGE


        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Thank You! Have a nice day!!");
        System.out.println("++++++++++++++++++++++++++++");
        scanner.close();
    }

    static void showBalance(double balance){

        System.out.println("------------");
        System.out.printf("$%.2f\n", balance);
        System.out.println("------------");
    }

    static double deposit(){

        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount <= 0){
            System.out.println("------------");
            System.out.println("Amount can't be negative");
            System.out.println("------------");
            return 0;
        }
        else {
            return amount;
        }
    }

    static double withdraw( double balance){
        System.out.print("Enter the amount to be withdrawn: ");

        double amount;
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("INSUFFICIENT BALANCE");
            return 0;
        }
        else if (amount <= 0){
            System.out.println("------------");
            System.out.println("Amount can't be 0 or lesser");
            System.out.println("------------");
            return 0;
        }
        else {
            return amount;
        }
    }
}
