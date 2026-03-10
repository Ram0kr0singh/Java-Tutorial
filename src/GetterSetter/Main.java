package GetterSetter;

public class Main {
    static void main(String[] args) {
        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Charger", "Yellow", 10000);

//        car.color = "Blue";
        car.setColor("Black");
        car.setPrice(3);

        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
    }
}
