package SavingsAccount;
public class SavingsAccountTest {
    public static void main(String []args){
        SavingsAccount saver1=new SavingsAccount(2000);
        SavingsAccount saver2=new SavingsAccount(3000);
        SavingsAccount.setIntrestRate(4);
        for(int i=0;i<12;i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            
        }
        System.out.format("%.2f \n",saver1.getSavingsBalance());
        System.out.format("%.2f \n",saver2.getSavingsBalance());
    }
}
