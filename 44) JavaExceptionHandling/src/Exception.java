import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    
    public static void main(String[] args) {
        
        // exception = an event that occurs during the execution of a program that
        //             disrupts normal flow of instructions
        Scanner scanner = new Scanner(System.in);

        try{

            

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: "+z);
        }
        catch(ArithmeticException e){
            System.out.println("You can´t divide by zero! IDIOT!");
        }
        catch(InputMismatchException e){
            System.out.println("PLEASE ENTER A NUMBER");
        }
        finally{
            // A finally block will always execute whether or not we catch an exception
            // a good use is to close the scanner
            System.out.println("This will always print");
            scanner.close();
        }
        
    }
}
