import java.util.Scanner;

public class DoWhileLoop {
    static void main() {

        int age = 0;
        Scanner scanner = new Scanner(System.in);

        // Executes atleast once
        do{
            System.out.println("Enter age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        System.out.println("Your age is " + age);
        scanner.close();
    }
}
