package OverloadedConstructors;

public class Main {
    static void main(String[] args) {
        // overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways.

        User user1 = new User("Ram");
        User user2 = new User("Ram", "ram@hgdfg.com");
        User user3 = new User("Ram", "ram@hgdfg.com", 67);
        User user = new User();

        System.out.println(user1.username);
        System.out.println(user1.age);
        System.out.println(user1.email);

        System.out.println(user2.username);
        System.out.println(user2.age);
        System.out.println(user2.email);

        System.out.println(user3.username);
        System.out.println(user3.age);
        System.out.println(user3.email);

        System.out.println(user.username);
        System.out.println(user.age);
        System.out.println(user.email);


    }
}
