package Person_Attributes;
public class Person {
    public String firstName;
    public String lastName;
    public String currentAddress;
    public long contactNumber;
    public int currentAge;
    public Person(){
    }
    public Person(String fName,String lName,String cAddress,long cNumber,int cAge){
        this.firstName=fName;
        this.lastName=lName;
        this.currentAddress=cAddress;
        this.contactNumber=cNumber;
        this.currentAge=cAge;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getCurrentAddress(){
        return currentAddress;
    }
    public void setCurrentAddress(String currentAddress){
        this.currentAddress=currentAddress;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber=contactNumber;
    }
    public int getCurrentAge(){
        return currentAge;
    }
    public void setCurrentAge(int currentAge){
        this.currentAge=currentAge;
    }
}
