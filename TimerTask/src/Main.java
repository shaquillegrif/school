import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask Task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello World");
                count--;
                if (count <= 0) {
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };

        timer.schedule(Task, 3000, 1000);
    }
}
