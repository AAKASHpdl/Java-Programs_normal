package Programs;
import java.util.Scanner;
public class Sum_three_integers {
    public static void main(String[] args){
        int a,b,c,sum;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the first integer : ");
        a=S.nextInt();
        System.out.println("Enter the second integer : ");
        b=S.nextInt();
        System.out.println("Enter the third integer : ");
        c=S.nextInt();
        sum=a+b+c;
        System.out.println("The sum of three integer is : "+sum);
    }
}
