import java.util.Scanner;

public class NestedLoop {
    static void main(String[] args) {

        //Nested Loops

//        for(int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println(); //Gets to the next line
//        }

        //Example

        int rows;
        int column;
        char symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter number of column: ");
        column = scanner.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = scanner.next().charAt(0);

        for(int i=1;i<=rows;i++){

            for (int j=1; j<= column; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
