public class VariableScope {
    int x = 3; //CLASS
    static void main(String[] args) {
        int x = 1; //LOCAL

        dosomething();
    }
    static void dosomething(){
        int x = 2; //LOCAL
        System.out.println(x);
    }
}
