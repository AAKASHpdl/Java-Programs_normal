package Person_Attributes;
public class PersonTest {
    public static void main(String [] args){
    Person p1=new Person("John","Smith","Kathmandu",9849112233L,25);
    System.out.println(p1.firstName+" "+p1.lastName); 
    System.out.println(p1.currentAddress);
    System.out.println(p1.contactNumber);
    System.out.println(p1.currentAge);
    }
}
