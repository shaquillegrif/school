import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "universfield-digital-alarm-clock-151920.wav";

        while (alarmTime == null) {
            try{
                System.out.print("Please enter your alarm time (HH:mm:ss): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("alarm set for " + alarmTime);


            }
            catch (DateTimeParseException e){
                System.out.println("Invalid time format");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

        scanner.close();
    }
}
