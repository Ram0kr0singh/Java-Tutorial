package InheritanceSuperKeyword;

public class Main {
    static void main(String[] args) {
        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Ram Kumar", "Singh");
        person.showName();

        Student student = new Student("Deepali", "Singh", 8);
        student.showName();
        student.showGpa();

        Employee employee = new Employee("Harsh", "Singh", 10000);
        employee.showSalary();
    }
}
