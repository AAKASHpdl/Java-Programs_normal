package Address_Book;
public class AddressBook {
   private String personName;
   private String personAddress;
   private String contactNumber;
   private static int numberOfObjects=0;
   public AddressBook(){
       numberOfObjects++;
    }
   public AddressBook(String pN,String pA,String contactNumber){
       numberOfObjects++;
       this.personName=pN;
       this.personAddress=pA;
       this.contactNumber=contactNumber;
   }
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public String getPersonAddress() {
        return personAddress;
    }
    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }
    public String getContactNumber() {
        return contactNumber;
    }
     public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public static void getEntry(){
        System.out.println("The number of records is:"+numberOfObjects);
    }
}
