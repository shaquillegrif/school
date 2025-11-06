

public class Main  {
    public static void main(String[] args) {

        String name = "Spongebob";
        char firstLetter = 's';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        double price1 = 9.99;
        double price2 = 100000.15;
        double price3 = -54.01;

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%d\n", id3);
        System.out.printf("%d\n", id4);

        System.out.printf("% .1f\n", price1);
        System.out.printf("%, .2f\n", price2);
        System.out.printf("% .3f\n", price3);

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("Your are %f centimeters tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);
    }
}
