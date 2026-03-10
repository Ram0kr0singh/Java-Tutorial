package OopsToString;

public class Main {
    static void main(String[] args) {
//        toString() = Method inherited from the Object class.
//                     Used to return a string representation of an object.
//                     By default, it returns a hash code as a unique identifier.
//                     It can be overridden to provide meaningful details.

        Car car1 = new Car("A", "B", 2025, "red");
        Car car2 = new Car("A2", "B2", 2026, "Blue");

        System.out.println(car1); //OopsToString.Car@8efb846
        System.out.println(car2);
    }
}
