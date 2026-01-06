import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("*******************************");
            System.out.println("Welcome to the Banking program!");
            System.out.println("*******************************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> System.out.println("withdraw");
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice!");
            }
        }


        // DISPLAY MENU

        // GET AND PROCESS USERS CHOICE

        // ShowBalance()

        // deposit()

        // withdraw()

        // EXIT MESSAGE

        scanner.close();
    }
    static  void showBalance(double balance) {
        System.out.println("*******************************");
        System.out.printf("$%.2f%n", balance);
    }
    static double deposit() {
        double amount;
        System.out.println("Enter amount to deposit: ");
        amount = scanner.nextDouble();
        if(amount < 0) {
            System.out.println("Invalid amount!");
            return 0;
        }
        else{
            return amount;

        }
    }
}
