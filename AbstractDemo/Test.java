package AbstractDemo;
public class Test {
    public static void main(String []args){
        Employee e[] = new Employee[2];
        SalaryEmployee s1=new SalaryEmployee("June","Sugarfoot Lane",98492255,50000); 
        ComissionEmployee c1=new ComissionEmployee("John","Winter Street",98491122,1000,80);
        e[0]=s1;
        e[0].computePay();
        e[1]=c1;
        e[1].computePay();
    }
}
