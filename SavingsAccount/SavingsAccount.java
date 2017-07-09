package SavingsAccount;
public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount(double sBalance){
        this.savingsBalance=sBalance;
    }
    public static void setIntrestRate(double iRate){
        SavingsAccount.annualInterestRate=iRate;
    }
    public void setSavingsBalance(double ibalance){
        this.savingsBalance=ibalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
    public void calculateMonthlyInterest(){
        double monthlyInterest=(this.savingsBalance*1*SavingsAccount.annualInterestRate*0.01)/12;
        this.savingsBalance+=monthlyInterest;
    }
}
