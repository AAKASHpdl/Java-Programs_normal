package Applications;
import java.util.Scanner;    
public class UserAdd 
{
    public static void main(String[] args){
        int a,b,sum;
        System.out.println("Enter yout first Number:");
        Scanner S = new Scanner(System.in);
        a=S.nextInt();
        System.out.println("Enter the second number:");
        b=S.nextInt();
        sum=a+b;
        System.out.println("The sum of two number is : "+sum);
    }
}
