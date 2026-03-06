import java.util.Scanner;
public class CompoundInterestCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal;
        double interest;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter principal: ");
        principal = sc.nextDouble();

        System.out.print("Enter interest rate in (in %): ");
        interest = sc.nextDouble() / 100;

        System.out.print("Enter compound: ");
        timesCompounded = sc.nextInt();

        System.out.print("Enter the year: ");
        years = sc.nextInt();

        amount = principal * Math.pow(1 + interest/timesCompounded, timesCompounded*years);
        System.out.printf("Your Compound interest is %f", amount);
        sc.close();
    }
}
