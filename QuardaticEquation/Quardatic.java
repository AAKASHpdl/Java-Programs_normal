package QuardaticEquation;
public class Quardatic {
    private double a,b,c;
    private double D;
    private double r1,r2;
    public Quardatic(){
    }
    public Quardatic(double aIn,double bIn,double cIn){
        this.a=aIn;
        this.b=bIn;
        this.c=cIn;
    }
    public void setA(double a){
        this.a=a;
    }
    public double getA(){
        return a;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return b;
    }
    public void setC(double c){
        this.c=c;
    }
    public double getC(){
        return c;
    }
    public void calculateD(){
        D=(b*b)-(4*a*c);
    }
    public void findR(){
        if(D<0){
            System.out.println("Sorry, real root does not exist");
        }
        else{
            r1=(-b+Math.sqrt(D))/(2*a);
            r2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("The roots are: "+r1+"\t"+r2);
            }
        }
    }
