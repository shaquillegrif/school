public class Main {
    public static void main(String[] args) {
    // method = a block of reusable code that is executed when called ()

        String name = "shaq";
        int age = 19;


        happyBirthday(name, age);
        System.out.println(square(3));
        System.out.println(cube(3));
        String fullName = getFullname("spongebob", "squarepants");
        System.out.println(fullName);

        int leeftijd =16;

        if (ageCheck(leeftijd)) {
            System.out.println("you may sign up");
        }else{
            System.out.println("you may not sign up you must be 18+");
        }

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
    static String getFullname(String first, String last) {
        return first + " " + last;
    }
    static boolean ageCheck(int leeftijd) {
        if (leeftijd >= 18) {
            return true;
        }
        else{
            return false;
        }
    }
}