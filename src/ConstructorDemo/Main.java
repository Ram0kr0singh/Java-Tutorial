package ConstructorDemo;

public class Main {
    static void main(String[] args) {

        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values
        Student student1 = new Student("GoonLord", 30, 30.67);
        Student student2 = new Student("Patrick",67, 33);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
    }
}
