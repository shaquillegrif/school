public class Main {
    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable (condition) ? ifTrue : ifFalse;

        int score = 70;
        int number = 3;
        int hours = 13;
        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        String passOrFail = (score >= 60) ? "pass" : "fail";
        String evenOrOdd = (number % 2 == 0) ? "even" : "odd";
        String timeOfDay = (hours < 12) ? "AM" : "PM";


        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(timeOfDay);
        System.out.println(taxRate);
    }
}
