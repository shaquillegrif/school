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

        do {
            System.out.print("Enter your move (rock, paper, scissor): ");
            playersChoice = scanner.nextLine(). toLowerCase();

            while (!playersChoice.equals("rock") &&
                    !playersChoice.equals("paper")&&
                    !playersChoice.equals("scissor")) {
                System.out.print("Invalid choice. Try again: ");
                playersChoice = scanner.nextLine();
            }

            computerChoice = choices[random.nextInt(choices.length)];
            System.out.println("Computer choice: " + computerChoice);
            if(playersChoice.equals(computerChoice)) {
                System.out.println("it's a tie");
            }
            else if((playersChoice.equals("rock") && computerChoice.equals("scissor"))||
                    (playersChoice.equals("paper") && computerChoice.equals("rock"))||
                    (playersChoice.equals("scissor") && computerChoice.equals("paper"))){
                System.out.println("you win");
            }
            else{
                System.out.println("you lose");
            }
            System.out.print("play again? (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();

        }while (playAgain.equals("yes"));

        System.out.println("thanx for playing");
        scanner.close();
    }
}
