package Programs;
import java.util.Scanner;
public class Positive_or_Negative {
    public static void main(String [] args){
        int n;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter your number :");
        n=S.nextInt();
        if(n>0)
            System.out.println("Your number is positive");
        else if(n<0)
            System.out.println("Your number is negative");
        else if(n==0)
            System.out.println("Your number is Zero");
        else
            System.out.println("Your number is invalid");
                        
    }
}
