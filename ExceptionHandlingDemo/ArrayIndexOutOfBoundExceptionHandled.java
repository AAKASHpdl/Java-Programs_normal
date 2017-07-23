package ExceptionHandlingDemo;
import java.util.Scanner;
public class ArrayIndexOutOfBoundExceptionHandled {
    public static void main(String[] args){
         int i=0,n=0;
         int number[] = new int[3];
         Scanner S = new Scanner(System.in);
         boolean continueLoop=true;
         do{
            try{
                System.out.println("Enter a integer: ");
                n=S.nextInt();
                System.out.println("They array index is 0 to 2");
                System.out.println("Enter a Index to save the integer to");
                System.out.println("You can also enter OutOfBound Index");
                System.out.println("The program will handle the excepetion: ");
                i=S.nextInt();
                number[i]=n;
                System.out.println();
                System.out.println("Integer saved successfully into array");
                continueLoop=false;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println();
                System.err.println("Exception: "+e.toString());
                System.out.println("Array Index is out of range");
                System.out.println("Please enter the array index within range to save integer to");
                System.out.println();
            }
         }while(continueLoop);
    }
}
