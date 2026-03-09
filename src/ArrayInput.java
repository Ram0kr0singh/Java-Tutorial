import java.util.Scanner;

public class ArrayInput {
    static void main(String[] args) {

//        String[] foods = {}

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no in Array: ");
        int total = scanner.nextInt();
        //Add one scanner.nextLine() after nextInt() to clear the leftover newline.
        scanner.nextLine();

        String[] foods = new String[total];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.print(food + " ");
        }

        scanner.close();
    }
}
