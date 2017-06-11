package Address_Book;
import java.util.Scanner;
public class AdressTest {
    public static void main(String[] args){
        AddressBook A1=new AddressBook();
        AddressBook A2=new AddressBook();
        Scanner S=new Scanner(System.in);
        A1.setPersonName("Bijay Shah");
        A1.setPersonAddress("New Thimi");
        A1.setContactNumber("9849331155");
        A2.setPersonName("Dipesh Karki");
        A2.setPersonAddress("Balaju");
        A2.setContactNumber("9849662288");
        System.out.println("### Person One ###");
        System.out.println("Name:"+A1.getPersonName());
        System.out.println("Address:"+A1.getPersonAddress());
        System.out.println("Contact Number: "+A1.getContactNumber());
        System.out.println("### Person Two ###");
        System.out.println("Name:"+A2.getPersonName());
        System.out.println("Address:"+A2.getPersonAddress());
        System.out.println("Contact Number: "+A2.getContactNumber());
        AddressBook.getEntry();
    }
}
