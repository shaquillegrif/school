import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(3);
//        list.add(1);
//        list.add(2);
//
//        System.out.println(list);
//
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("apple");
//        fruits.add("orange");
//        fruits.add("pineapple");
//        fruits.add("grape");
//        System.out.println(fruits);
//
//        fruits.remove(0);
//        System.out.println(fruits);
//
//        fruits.set(0, "coconut");
//        System.out.println(fruits);
//
//
//        System.out.println(fruits.get(0));
//
//        System.out.println(fruits.size());
//
//        Collections.sort(fruits);
//        System.out.println(fruits);
//
//
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("enter the number of foods you would like: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("what food would you like to add: ");
            list.add(scanner.next());
        }

        System.out.println(list);


        scanner.close();
    }
}
