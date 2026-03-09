import java.awt.*;
import java.util.Scanner;

public class ArraySearch {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int[] numbers = {1,9,5,6,3,7};
        String[] elements = {"apple", "banana", "coconut", "pineapple"}; //isequals instead of == cuz array are reference datatype
        String target2;
        boolean isFound = false;

//        int target = 2;
        System.out.print("Enter a fruit to check in array: ");
        target2 = scanner.nextLine().toLowerCase();

//        for (int i =0; i<numbers.length; i++){
//            if (target == numbers[i]){
//                System.out.printf("Your Number %d is at index %d", target, i);
//                isFound = true;
//                break;
//            }
//        }
//        if(!isFound){
//            System.out.println("Element not found");
//        }

        for (int i =0; i<elements.length; i++){
            if (elements[i].equals(target2)){
                System.out.printf("Your fruit %s is at index %d", target2, i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.printf("%s not found", target2);
        }


        scanner.close();
    }
}
