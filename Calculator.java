package Applications;
import java.util.Scanner;
public class Calculator {
    public static int add(int a , int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static int mult(int a, int b){
        return a*b;
    }
    public static void main(String[] args){
        int a,b,n,result=0;
        System.out.println("1.Add    2.Subtract");
        System.out.println("3.Div    4.Mult");
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your first number:");
        a=S.nextInt();
        System.out.println("Enter your second number:");
        b=S.nextInt();
        System.out.println("Choose a number from the menu");
        n=S.nextInt();
        switch(n)
        {
            case 1:
                result=add(a,b);
                System.out.println("The result is :"+result);
            break;
            case 2:
                result=sub(a,b);
                 System.out.println("The result is :"+result);
            break;
            case 3:
                result=div(a,b);
                System.out.println("The result is :"+result);
            break;
            case 4:
                result=mult(a,b);
                 System.out.println("The result is :"+result);
            break;
        }
    }
    
}
