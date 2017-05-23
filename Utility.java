
public class Utility {
    public static boolean Even(int n){
        if(n%2==0)
            return true;
        else
            return false;
    }
    public static boolean Odd(int n){
        if(n%2==1)
            return true;
        else
            return false;
    }
    public static boolean Prime(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2)
            return true;
        else
            return false;
    }
    public static boolean leapYear(int n){
        if(n%4==0&&n%100!=0||n%400==0)
            return true;
        else
            return false;
    }
    public static boolean Palindrome(int n){
        int r=0;
        int temp;
        temp=n;
        for(;n>=1;n=n/10){
            r=(r*10)+(n%10);
        }
        if(temp==r)
            return true;
        else
            return false;
    }
}
