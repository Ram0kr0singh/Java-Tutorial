package OopsDemo;

public class Car {
//    Attributes
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 5976.976;
    boolean isRunning = false;

    void carStart(){
        isRunning = true;
        System.out.println(year + " Engine on");
    }
    void carStop(){
        isRunning = false;
        System.out.println(make + " Off");
    }
}
