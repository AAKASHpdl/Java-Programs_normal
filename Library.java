import java.util.Scanner;
public class Library {
    public static void main(String [] args){
    int n;
    System.out.println("Enter your number");
    Scanner S = new Scanner(System.in);
    n= S.nextInt();
    System.out.println("Even="+Utility.Even(n));
    System.out.println("Odd="+Utility.Odd(n));
    System.out.println("Prime="+Utility.Prime(n));
    System.out.println("leapYeap="+Utility.leapYear(n));
    System.out.println("Palindrome="+Utility.Palindrome(n));
    }
}