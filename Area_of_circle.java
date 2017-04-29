package Programs;
import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args){
        double r,area;
        System.out.println("Enter the radius of circle : ");
        Scanner S = new Scanner(System.in);
        r=S.nextInt();
        area=3.14*r*r;
        System.out.println("The area of circle is : "+area);
    }
}
