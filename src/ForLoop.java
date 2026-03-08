import java.util.Scanner;

public class ForLoop {
    static void main(String[] args) throws InterruptedException {
        //For Loop - when you need to run a loop n number of times
        Scanner scanner = new Scanner(System.in);

        System.out.println("Countdown fron how many seconds?: ");
        int start = scanner.nextInt();

        for (int i =start; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year");
    }
}
