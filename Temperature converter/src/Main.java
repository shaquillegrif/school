import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temperature;
        double newTemperature;
        String unit;

        System.out.print("Please enter the temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Please enter the unit (C or F) : ");
        unit = scanner.next().toUpperCase();

       newTemperature = (unit.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 5 / 9) +32;

        System.out.printf("%.1f°%s",newTemperature , unit);
        scanner.close();
    }
}
