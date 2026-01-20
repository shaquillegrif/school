public class Main {
    public static void main(String[] args) {

//        String[] fruits = {"apple", "Banana", "Orange"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef", "fish"};

//        String[][] groceries = {fruits, vegetables, meats};
        String[][] groceries = {{"apple", "Banana", "Orange"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};

        groceries[0][0] = "pineapple";
        groceries[1][0] = "celery";
        groceries[1][2] = "cheese";
        groceries[2][1] = "eggs";

        for (String[] foods: groceries){
            for (String food: foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
