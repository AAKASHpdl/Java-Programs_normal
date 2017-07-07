package AbstractDemo;
public class SalaryEmployee extends Employee{
    private double yearlySalary;
    public SalaryEmployee(){
    }
    public SalaryEmployee(String name,String address,int number,double yearlySalary){
        super(name,address,number);
        this.yearlySalary=yearlySalary;
    }
    public double getYearlySalary() {
        return yearlySalary;
    }
    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    @Override
    public void computePay(){
       this.toString();
       System.out.println(this.toString());
       System.out.println("Weekely pay= "+(this.yearlySalary/2));
    }
}
