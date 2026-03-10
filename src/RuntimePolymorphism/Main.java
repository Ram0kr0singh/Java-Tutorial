package RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // Runtime (Dynamic) polymorphism = When the method that gets executed is decided
        //                                  at runtime based on the actual type of the object.

//        Animal animal = new Animal();

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Dog (1) or Cat?(2): ");
        int choice = scanner.nextInt();

        if (choice == 1){
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
    }
}
