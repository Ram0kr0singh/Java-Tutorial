package OverloadedConstructors;

public class User {
    String username;
    String email;
    int age;

    User(){
        this.username = "guest";
        this.email = "guest@email";
        this.age = 0;
    }
    User(String username){
        this.username = username;
        this.email = "Not her";
        this.age = 10;
    }
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
