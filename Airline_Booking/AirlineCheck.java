package Airline_Booking;
import java.util.Scanner;
public class AirlineCheck {
    public static void main(String [] args){
        Airline.vacateSeats();
        Scanner sc1=new Scanner(System.in);
        while(true){
            Airline.displayChoice();
            int j=sc1.nextInt();
            Airline.reserveSeat(j);
        }
    }
}
