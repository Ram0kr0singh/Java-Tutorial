import java.util.Scanner;
public class UserInputTwo {
    static void main(String[] args) {
        double height = 0;
        double width = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a height: ");
        height = scanner.nextDouble();
        System.out.print("Enter a Width: ");
        width = scanner.nextDouble();

        area = height * width;
        System.out.println("Your Area is : " + area + "cm^2");

        scanner.close();
    }
}
