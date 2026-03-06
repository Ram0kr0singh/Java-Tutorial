import java.util.Random;

public class RandomNumberGen {
    static void main(String[] args) {
//    double no1;
//
//    no1 = Math.random();
//
//        System.out.println("Your Area is : " + no1 + "cm^2");
    Random random = new Random();

    int a = random.nextInt(100);
    float b = random.nextFloat(1000);
        System.out.println(a);
        System.out.println(b);
    }
}
