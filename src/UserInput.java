import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        //25/n here /n counts as a next line so just add scanner.nextLine(); again without any input to fix it


//        byte age2 = scanner.nextByte();
        System.out.println(age);
//        System.out.println("Hello " + name);
        /*
    for(int i=0;i<name.length();i++){
        char txt = name.charAt(i);
        System.out.println(txt);
    }
    */

    scanner.close();
    }
}
