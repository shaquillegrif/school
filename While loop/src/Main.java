import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String name = "";
        String response = "";
        int age = -1;

        while (name.isEmpty()){
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello, " + name + "!");

        while (!response.equals("Q") ){
            System.out.println("you are playing a game");
            System.out.println("Press Q to quit");
            response = scanner.nextLine().toUpperCase();
        }
        System.out.println("you have quit the game");

        System.out.println("Enter your age");
        age = Integer.parseInt(scanner.nextLine());

        while (age < 0){
            System.out.println("Your age cant be negative");
            System.out.println("Enter your age");
            age = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("You are " + age + " years old");

        scanner.close();
    }
}
