import java.util.Random;

public class main {
    public static void main(String[] args) {

        Random random = new Random();

        int number1;
        double number2;
        boolean coinFlip;

        number1= random.nextInt(1, 7);
        number2= random.nextDouble(1, 7);
        coinFlip = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);

        if(coinFlip){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
}
