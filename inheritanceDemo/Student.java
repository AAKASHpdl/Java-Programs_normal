package inheritanceDemo;
public class Student extends Person {
    private int IDNumber;
    private String intake;
    public int value=123;
    public Student(){
    }
    public Student(int IDNumber,String intake) {
        this.IDNumber=IDNumber;
        this.intake=intake;
    }
    public Student(int IDNumber,String intake,String name,String address,String telephone,String email) {
        super(name,address,telephone,email);
        this.IDNumber=IDNumber;
        this.intake=intake;
    }
    @Override 
    public String getName(){
        return(super.getName());
    }
    public int getIDNumber() {
        return IDNumber;
    }
    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }
    public String getIntake() {
        return intake;
    }
    public void setIntake(String intake) {
        this.intake = intake;
    }
    @Override
    public void printProfile(){
        super.printProfile();
        System.out.println("Your id number is "+this.IDNumber);
        System.out.println("Your intake is "+this.intake);
    } 
}
