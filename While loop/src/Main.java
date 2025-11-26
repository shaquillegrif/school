import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String name = "";
        String response = "";
        int age = 0;
        int number = 0;

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

        System.out.print("Enter your age: ");
        age = Integer.parseInt(scanner.nextLine());

        while (age < 0){
            System.out.print("Your age cant be negative");
            System.out.print("Enter your age: ");
            age = Integer.parseInt(scanner.nextLine());
        }


        System.out.println("You are " + age + " years old");

        do {
            System.out.print("Your number must be between 1 and 10: ");
            number = Integer.parseInt(scanner.nextLine());
        }while (number < 1||number > 10);

        System.out.println("you picked " + number);
        scanner.close();
    }
}
