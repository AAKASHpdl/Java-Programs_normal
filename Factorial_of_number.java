package Programs;
import java.util.Scanner;
public class Factorial_of_number {
    public static void main(String [] args){
        int z=1;
        int n,i;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter your number to find factorial of :");
        n=S.nextInt();
        while(n>0){
            z=z*n;
            n--;
        }
        System.out.println("The factorial of your number is : "+z);
    }
}
