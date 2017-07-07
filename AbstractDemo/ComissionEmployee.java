package AbstractDemo;
public class ComissionEmployee extends Employee{
    private double monthlySales;
    private double comissionRates;
    public ComissionEmployee(){
    }
    public ComissionEmployee(String name,String address,int number,double monthlySales,double comissionRates){
        super(name,address,number);
        this.monthlySales=monthlySales;
        this.comissionRates=comissionRates;
    }
    public double getMonthlySales() {
        return monthlySales;
    }
    public void setMonthlySales(double monthlySales) {
        this.monthlySales = monthlySales;
    }
    public double getComissionRates() {
        return comissionRates;
    }
    public void setComissionRates(double comissionRates) {
        this.comissionRates = comissionRates;
    }
    @Override
    public void computePay(){
        System.out.println();
        System.out.println(this.toString());
        System.out.println("Weekely Pay: "+((this.monthlySales*comissionRates)/4));
    }
}
