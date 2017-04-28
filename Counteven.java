package Applications;
import java.util.Scanner;
public class Counteven {
    public static void main(String[] args){
        int n,count=0;
        System.out.println("Enter your number upto which to find even numbers");
        Scanner S = new Scanner(System.in);
        n=S.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
            count=count+1;
            }
        }
        System.out.println("The total number of odd numbers is : "+count);
    }
 }
