import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        //fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

        System.out.println(fruits[0]);
        System.out.println(numOfFruits);

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        Arrays.sort(fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        Arrays.fill(fruits, "pinapple");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
