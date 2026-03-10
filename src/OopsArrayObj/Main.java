package OopsArrayObj;

public class Main {
    static void main(String[] args) {
        Car car1 =  new Car("Mustanf", "Black");
        Car car2 =  new Car("Mustan2", "Black2");
        Car car3 =  new Car("Mustan3", "Black3");

//        Car[] cars = new Car[3];
        Car[] cars = {car1, car2, car3};

//        for(int i = 0;i < cars.length; i++ ){
//            cars[i].drive();
//        }

        for (Car car : cars){
            car.drive();
        }

    }
}
