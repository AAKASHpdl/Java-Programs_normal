package Programs;
import java.util.Scanner;
public class Circumference_of_circle {
    public static void main(String[] args){
        double r;
        double d,circumference;
        System.out.println("Enter the Diameter of circle : ");
        Scanner S = new Scanner(System.in);
        d=S.nextInt();
        r=d/2;
        circumference=2*3.14*r;
        System.out.println("The circumference of circle is : "+circumference);
    }
}
