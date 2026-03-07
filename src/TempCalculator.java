import java.util.Scanner;

public class TempCalculator {
    static void main(String[] args) {

    //Temperature Calculator
        System.out.print("Enter the Temperature: ");
        double temp;
        String unit;
        double newTemp;

        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;
        System.out.printf("%.1f%s",newTemp, unit);

        scanner.close();
    }
}
