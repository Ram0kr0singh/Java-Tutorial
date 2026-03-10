package Inheritance;

public class Main {
    static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        dog.eat();
        dog.speak();
        System.out.println(dog.lives);
        System.out.println(cat.isAlive);
        cat.eat();
        cat.speak();

        Plant plant = new Plant();
        System.out.println(plant.isAlive);
        plant.photosynthsis();

    }
}
