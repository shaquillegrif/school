import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissor"};
        String playersChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println("Enter your move (rock, paper, scissor): ");
        playersChoice = scanner.nextLine(). toLowerCase();
        




        scanner.close();
    }
}
