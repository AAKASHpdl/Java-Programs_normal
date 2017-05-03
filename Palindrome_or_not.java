package Programs;
import java.util.Scanner;
public class Palindrome_or_not {
    public static void main(String [] args){
     int r=0;
        int n,temp,z;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter yout number :");
        n=S.nextInt();
        temp=n;
        while(n>0){
            z=n%10;
            r=r*10+z;
            n=n/10;
        }
        if(temp==r)
            System.out.println("The number is a Palindrome");
        else
            System.out.println("The number is not a Palindrome");
    }
}
