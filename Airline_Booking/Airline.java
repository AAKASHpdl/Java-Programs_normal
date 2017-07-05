package Airline_Booking;
import java.util.Scanner;
public class Airline {
    private static boolean seats[]=new boolean[10];
    private static int numberOfSeatsTakenEconomy=0;
    private static int numberOfSeatsTakenBusiness=0;
    public static void vacateSeats(){
        for(int i=0;i<seats.length;i++){
            seats[i] = false;
        }
    }
    public static void displayChoice(){
        System.out.println("Please Enter 1 for economy and 2 for business class");
    }
    public static void printBoardingPass(String input){
        if(input.equalsIgnoreCase("Economy")){
            System.out.println("Class: Economy \n Seat Number: "+numberOfSeatsTakenEconomy);
            System.out.println("Thanks For Booking With Us");
        }
        else{
        System.out.println("Class: Business \n Seat Number: "+(numberOfSeatsTakenBusiness+5));
        System.out.println("Thanks For Booking With Us");
        }
    }
    public static void reserveSeat(int choice){
        if(choice==1&&numberOfSeatsTakenEconomy<5){
            seats[numberOfSeatsTakenEconomy]=true;   
            numberOfSeatsTakenEconomy++;
            printBoardingPass("Economy");
        }
        else if(choice==2&&numberOfSeatsTakenBusiness<5){
            seats[numberOfSeatsTakenBusiness+5]=true;
            numberOfSeatsTakenBusiness++;
            printBoardingPass("Business");
        }
        else if(choice==1&&numberOfSeatsTakenEconomy==5){
            Scanner sc1=new Scanner(System.in);
            System.out.println("Economy is now full. Press 2 for business and any key to exit ??");
            int nextChoice=sc1.nextInt();
            if(nextChoice==2){
                reserveSeat(nextChoice);
            }
            else{
                System.out.println("Thanks, Next Flight Leaves in 3 hours");
                System.exit(0);
            }
        }
        else if(choice==2&&numberOfSeatsTakenBusiness==5){
            Scanner sc1=new Scanner(System.in);
            System.out.println("Business is now full. Press 2 for economy and any key to exit ??");
            int nextChoice=sc1.nextInt();
            if(nextChoice==2){
                reserveSeat(nextChoice-1);
            }
            else{
                System.out.println("Thanks, Next Flight Leaves in 3 hours");
                System.exit(0);
            }
        }
    }
}
