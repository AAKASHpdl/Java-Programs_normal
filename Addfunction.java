package Applications;
public class Addfunction {
    public static int add(int a,int b){
        int c;
        c=a+b;
        return c;
    }  
      
      
    public static void main(String[] args){
        int a=5,b=10,result;
        result=add(a,b);
        System.out.println("The sum is : "+result);
    }
}
