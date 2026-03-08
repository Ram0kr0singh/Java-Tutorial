public class MethodsDemo {
    static void main(String[] args) {
        // Method = A block of reusable codes executed when called ()
        // Method = Are unaware of variable declared in another method

        String name = "Ram";
        int age = 21;
        /*
        happyBirthday(name, age);
        */
        double result = squareNumber(age);
        System.out.println(result);
    }
//    static void happyBirthday(String name, int age){
    static void happyBirthday(String naam, int age){
        System.out.println("Happy");
        System.out.printf("%d'st Birthday\n", age);
        System.out.println("to");
        System.out.printf("you %s", naam);
//        System.out.printf("you %s", name);
        System.out.println();
    }

    static double squareNumber(double age){
        return Math.pow(age,2);
    }

}
