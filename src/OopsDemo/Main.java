package OopsDemo;

public class Main {
    static void main(String[] args) {
        //        Object = An entity that hold data (attributes) eg -> double weight;
        //                  and perform tasks (methods) -> eats(), sleeps()
        //                  It is a reference data type (saved in heap memory)

        Car car = new Car();

        System.out.println(car.isRunning);
        car.carStart();
        System.out.println(car.isRunning);
        car.carStop();
        System.out.println(car.isRunning);

    }
}
