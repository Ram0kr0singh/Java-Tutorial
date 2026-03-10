package ConstructorDemo;

public class Student {
    String name = "Gooner";
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int b, double c){
        this.name = name;
        this.age = b;
        this.gpa = c;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
