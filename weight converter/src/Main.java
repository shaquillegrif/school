import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;

        System.out.println("Welcome to the weight converter!");
        System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");
        try {
            int choice;
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Please enter the weight in lbs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 0.453592;
                System.out.printf("the new weight in kgs is: %.2f", newWeight);
            }

            if (choice == 2) {
                System.out.print("Please enter the weight in kgs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462;
                System.out.printf("the new weight in lbs is: %.2f", newWeight);
            } else {
                System.out.println("Invalid input!");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input need numbers!");
        }
        scanner.close();
    }
}
