import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String name = "";
        String response = "";

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

        scanner.close();
    }
}
