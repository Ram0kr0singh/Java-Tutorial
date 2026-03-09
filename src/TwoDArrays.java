public class TwoDArrays {
    static void main(String[] args) {
        //2D Arrays = AN array where each element is an Array
        //            Useful for storing a matrix of data
//        String[] fruits = {"apple", "orange", "banana"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef", "fish"};

//        String[][] groceries = {fruits, vegetables, meats};
        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};

        groceries[0][2] = "yellowBanana";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
    }
