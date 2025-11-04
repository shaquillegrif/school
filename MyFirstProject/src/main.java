public class main {
    public static void main(String [] args) {
        //THIS IS MY FIRST JAVA PROGRAM
        /*
        this
        is
        a
        multi-line
        comment
         */
        System.out.println("I like pizza!");
        System.out.println("It's really good!");
        System.out.print("Buy me pizza!");
        System.out.println("herru herru herru");
        System.out.println("ollah");
        System.out.println("I like trains!!!!!!");

        int age = 30;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name ="Shaquille Griffith";



        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);

        System.out.println("the year is " + year);
        System.out.println("$" + price);

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        System.out.println(isStudent);
        System.out.println(forSale);

        if(isStudent == true){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

        System.out.println(name);
    }
}
