import java.util.Scanner;

public class Main {
    public static String capitalizeAndFormat(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day of week: ");
        String userInput = scanner.nextLine();

        String day = capitalizeAndFormat(userInput);


        switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day");
        }
        scanner.close();
    }
}