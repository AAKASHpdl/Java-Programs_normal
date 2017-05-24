package Heart_Monitor;
import java.util.Scanner;
public class HeartRatesTest {
    public static void main(String [] args){
    Scanner S=new Scanner(System.in);
    HeartRates p1=new HeartRates();
    System.out.println("Enter your First Name:");
    p1.setFirstName(S.next()); 
    System.out.println("Enter your Last Name:");
    p1.setLastName(S.next());
    System.out.println("Enter current Location:");
    p1.setCurrentLocation(S.next());
    System.out.println("Enter your year of Birth:");
    p1.setBirthYear(S.nextInt());
    System.out.println();
    System.out.println("#####Your Information#####");
    System.out.println("Name: "+p1.getFirstName()+" "+p1.getLastName());
    System.out.println("Location: "+p1.getCurrentLocation());
    System.out.println("Birth Year: "+p1.getBirthYear());
    System.out.println("Your age is "+p1.getAge());
    System.out.println("Your maxiumum HeartRate is "+p1.getMaximumHeartRate());
    p1.getTargetHeartRate(p1.getMaximumHeartRate());
    }
}
