public class NestedIfs {
    static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;

        double price = 9.99;

        if (isStudent){
            if (isSenior){
                System.out.println("You get a discount of 50%");
                price *= 0.5;
            }
            else {
                System.out.println("You get a discount of 10%");
                price *= 0.9;
            }
        }
        else {
            price *= 1;
        }
        System.out.printf("The price is : $%.2f", price);
    }
}
