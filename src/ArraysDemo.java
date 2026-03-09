import java.util.Arrays;

public class ArraysDemo {
    static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};

//        fruit[1] = "Eggplant";
//        int numOfFruits = fruit.length;

//        System.out.println(fruits[0]);
//        System.out.println(fruits[1]);
//        System.out.println(fruits[2]);
//        System.out.println(fruits[3]);
//        System.out.println("No. of fruits: " + numOfFruits);

//    for (int i =0; i< fruits.length; i++){
//        System.out.println(fruit[i]);
//    }

//  Import Arrays
//    Arrays.sort(fruits);
    Arrays.fill(fruits,"Grapes");

    // Enhanced for loop (for each loop)

        for (String f : fruits){
            System.out.println(f);
        }
    }
}
