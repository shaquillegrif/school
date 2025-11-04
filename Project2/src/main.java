import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student (true/false)?");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello, " + name);
        System.out.println("Your age is " + age + " years old.");
        System.out.println("Your gpa is " + gpa);

        if (isStudent) {
            System.out.println("You are enrolled as a student.");
        }
        else{
            System.out.println("You are not enrolled.");
        }
        scanner.close();
    }
}
