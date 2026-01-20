import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebook launched?",
                              "Who is know as the father of computers?",
                              "What was the first programming language?"};

        String[][] option = {{"1. storing files", "2. encrypting data", "3. directing data", "4. managing passwords"},
                             {"1. CPU", "2. hard drive", "3. RAM", "4. GPU"},
                             {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                             {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turning", "4. Charles Babbage"},
                             {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the java quiz game!");
        System.out.println("******************************");

        scanner.close();
    }
}
