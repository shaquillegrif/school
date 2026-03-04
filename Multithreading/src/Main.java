public class Main {
    public static void main(String[] args) {

        Thread thread1 =  new Thread(new MyRunnable("ping"));
        Thread thread2 =  new Thread(new MyRunnable("pong"));

        System.out.println("game start");

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }

        System.out.println("game end");
    }
}
