import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        LocalDate date2 = LocalDate.of(2024, 12, 25);
        LocalDateTime dateTime1 = LocalDateTime.of(2023, 12, 25, 12, 12);
        LocalDateTime dateTime2 = LocalDateTime.of(2024, 12, 25, 12, 12);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String newDateTime = dateTime.format(formatter);

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);
        System.out.println(newDateTime);
        System.out.println(date2);
        System.out.println(dateTime2);

        if(dateTime1.isBefore(dateTime2)) {
            System.out.println(dateTime1 + " is before " + dateTime2);
        }
    }
}
