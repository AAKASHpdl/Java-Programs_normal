package ExceptionHandlingDemo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivideByZeroExceptionHandled {
     public static int quotient(int numerator, int denominator){
        return numerator/denominator;
    }
     public static void main(String[] args){
         Scanner S = new Scanner(System.in);
         boolean continueLoop=true;
         do{
            try{
                System.out.println("Enter Numerator: ");
                int numerator =S.nextInt();
                System.out.println("Enter Denominator: ");
                int denominator =S.nextInt();
                int result = quotient(numerator,denominator);
                continueLoop=false;
            }
            catch(ArithmeticException e){
                System.err.println("Exception: " + e.toString());
                System.out.println("Deominator cannot be Zero");
                System.out.println("Please enter the value again");
            }
            catch(InputMismatchException i){
                System.err.println("Exception: " + i.toString());
                S.nextLine();
                System.out.println("Denominator cannot be character");
                System.out.println("Please enter the value again");
            }
         }
         while(continueLoop);
     }
}
