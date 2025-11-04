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

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;

        String name ="Shaquille Griffith";
        String food ="pizza";
        String email ="fake123@gmail.com";
        String car ="Mustang";
        String color = "red";



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

        System.out.println("Hello " + name);
        System.out.println("Your favorite food is " + food);
        System.out.println("Your email is " + email);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa);
        System.out.println("Your average letter grade is: " + grade);
        System.out.println("Your choice is a " +color + " " + year + " " + car);
        System.out.println("The price is: " +currency + price);

        if(forSale == true){
            System.out.println("There is a " +car +" for sale");
        }
        else{
            System.out.println("The " + car +" is not for sale");
        }
    }
}
