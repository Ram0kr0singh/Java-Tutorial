import java.util.Scanner;

public class SubstringProg {
    public static void main(String[] args) {
        System.out.print("Enter your email: ");
         Scanner sc = new Scanner(System.in);
         String email = sc.nextLine();

        if (email.contains("@")) {
//         String email = "Ramkumar@gmail.com";
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Enter a proper email");

        }

        sc.close();
    }
}
