package AddMethodOverloading;
public class MethodOverload {
    int a,b,c,d,e;
    int sum=0;
    public void addMethod(int a,int b){
        sum=a+b;
        System.out.println("The sum of your two number is "+sum);
    }
    public void addMethod(int a,int b,int c){
        sum=a+b+c;
        System.out.println("The sum of your three number is "+sum);
    }
    public void addMethod(int a,int b,int c,int d){
        sum=a+b+c+d;
        System.out.println("The sum of your four number is "+sum);
    }
    public void addMethod(int a,int b,int c,int d,int e){
        sum=a+b+c+d+e;
        System.out.println("The sum of your five number is "+sum);
    }
}
