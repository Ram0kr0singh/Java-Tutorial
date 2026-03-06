import java.util.Scanner;
public class UserInputString {
    static void main(String[] args) {

        String name;
        Boolean isStudent;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();
//        System.out.println(name);

        if(name.isEmpty()){
            System.out.println("Name can't be empty");
        } else{
            System.out.println("Your name is " + name);
        }

        System.out.print("Enter if student true or false: ");
        isStudent = sc.nextBoolean();
        if(isStudent){
            System.out.println("Is Student");
        }
        else{
            System.out.println("Not a studnet");
        }
        sc.close();
    }
}
