import java.util.Scanner;

public class EnhancedSwitches {
    static void main(String[] args) {

        System.out.print("Enter a day of the week: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next().toLowerCase();

        switch (day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It's a Weekday");
//            case "wednesday" -> System.out.println("It's a Weekday");
//            case "thursday" -> System.out.println("It's a Weekday");
//            case "friday" -> System.out.println("It's a Weekday");
            case "saturday", "sunday" -> System.out.println("It's a Weekend");
            default -> System.out.printf("%s is not a valid day dumbo",day);
        }
        scanner.close();
    }
}
