public class Main {
    public static void main(String[] args) {

        String name = "shaq";
        int age = 19;


        happyBirthday(name, age);
        System.out.println(square(3));
        System.out.println(cube(3));



    }
        static void happyBirthday(String name, int age) {
            System.out.println("Happy birthday to you!");
            System.out.printf("Happy birthday dear %s!\n", name);
            System.out.printf("you are %d years old!\n", age);
            System.out.println("happy birthday to you!\n");
        }
        static double square(double number) {
            return number * number;
    }
    static double cube(double number) {
        return number * number * number;
    }

}