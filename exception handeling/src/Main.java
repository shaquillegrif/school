import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        try( Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("Entered number is: " + num);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }

        catch(ArithmeticException e){
            System.out.println("you can't divide by zero");
        }
        catch(Exception e){
            // safety net
            System.out.println("error something went wrong");
        }
        finally{
            System.out.println("this always executes");
        }
    }
}
