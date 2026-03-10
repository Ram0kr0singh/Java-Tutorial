package Abstraction;

public abstract class Shape {

    abstract double area(); //Abstract (complete abstraction --- maybe)

    void display(){ //Concrete
        System.out.println("this is a Shape");
    }
}
