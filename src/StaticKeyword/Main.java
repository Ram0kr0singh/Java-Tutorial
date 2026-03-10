package StaticKeyword;

public class Main {
    static void main(String[] args) {
        // static = Makes a variable or method belong to the class
        //           rather than to any specific object.
        //           Commonly used for utility methods or shared resources.

        Friends friend1 = new Friends("Ram");
        Friends friend2 = new Friends("Ram1");

        System.out.println(friend1.name);
        // System.out.println(friend1.numOfFriends); //Use class variable better for coders
//        System.out.println(Friends.numOfFriends);
    Friends.showFriends();
    }
}
