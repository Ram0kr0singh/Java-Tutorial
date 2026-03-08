public class LogicalOpp {
    static void main(String[] args) {
        double temp = 30;
        boolean isSunny = true;

//        if (temp >= 0 && temp <= 50 && isSunny) {
        if (temp >= 0 || temp <= 50 || isSunny) {
            System.out.println("good weather");
        } else if (temp >= 0 && temp <= 50 && !isSunny) {
            System.out.println("In middle");
        }
        else {
            System.out.println("Bad Weather");
        }
    }
}