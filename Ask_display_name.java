package Programs;
import java.util.Scanner;
public class Ask_display_name {
    public static void main(String[] args){
        String n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter yout name : ");
        n=S.next();
        System.out.println("Your name is "+n);
    }
}
